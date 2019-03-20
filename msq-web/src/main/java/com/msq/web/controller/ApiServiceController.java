package com.msq.web.controller;

import com.msq.common.pojo.SeDataSource;
import com.msq.common.pojo.SeSearchSql;
import com.msq.common.pojo.SeService;
import com.msq.common.pojo.SeServiceExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import com.msq.web.service.ApiService;
import com.msq.web.util.JDBCTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;


/**
 * @auther:Zhousl
 * @date:2019/1/18
 * @Description:
 */
@RestController
@RequestMapping("/web-service")
public class ApiServiceController {
    @Autowired
    private ApiService apiService;
    /**
     * 获取服务
     * @param queryData
     * @return
     */
    @RequestMapping("/query-list")
    public ReturnResult queryList(@RequestBody QueryData<SeServiceExample> queryData){
        ReturnResult returnResult = apiService.queryList(queryData);
        return returnResult;
    }

    @RequestMapping("/save-or-update")
    public ReturnResult saveOrUpdate(@RequestBody SeService seService){
        ReturnResult returnResult = apiService.saveOrUpdate(seService);
        return returnResult;
    }

    @RequestMapping("/delete")
    public ReturnResult delete(@RequestBody SeService seService){
        ReturnResult returnResult = apiService.delete(seService);
        return returnResult;
    }

    @RequestMapping("/api-queryDetailField")
    public ReturnResult queryDetailField(@RequestBody QueryData<SeServiceExample> queryData){
        Map<String,Object> map = apiService.apiQuery(queryData);
        SeDataSource seDataSource = new SeDataSource();
        String sql = null;
        String fieldConfig= null;
        Map dataSource = new HashMap();
        try {
            for (Map.Entry<String ,Object> entry:map.entrySet()
                 ) {
                   String key =  entry.getKey();
                   if("sql".equals(key)){
                       sql = (String)entry.getValue();
                   }
                   if("fieldConfig".equals(key)){
                       fieldConfig = (String )entry.getValue();
                   }
                   if("url".equals(key)){
                       seDataSource.setUrl((String) entry.getValue());
                   }
                   if("driverClassName".equals(key)){
                       seDataSource.setDriverClassName((String) entry.getValue());
                   }
                   if("username".equals(key)){
                       seDataSource.setUserName((String) entry.getValue());
                   }
                   if("userPwd".equals(key)){
                       seDataSource.setUserPwd((String)entry.getValue());
                   }
                   if("library".equals(key)){
                       seDataSource.setLibrary((String)entry.getValue());
                   }
            }
            JdbcTemplate jdbcTemplate = JDBCTemplate.dataSourceManager(seDataSource);
            String[] fieldArray = fieldConfig.split(",");
            List<Map> resultList = jdbcTemplate.query(sql, new RowMapper<Map>() {
                @Override
                public Map mapRow(ResultSet resultSet, int i) throws SQLException {
                    int columnCount = resultSet.getMetaData().getColumnCount();
                    Map<String ,Object> dataMap = new LinkedHashMap<>();
                    for(int j =1;j<=columnCount;j++){
                        dataMap.put(fieldArray[j-1],resultSet.getObject(j));
                    }
                    return dataMap;
                }
            });


            Map std_data = new HashMap();
            Map parameter = new HashMap();

            List field_dataAetArray = new ArrayList();

            for (Map<String,Object> resultMap:resultList
                 ) {
                Set<Map.Entry<String,Object>> resultEntry = resultMap.entrySet();
                Map field_dataSet = new HashMap();
                for (Map.Entry entry: resultEntry
                     ) {
                    String key = (String)entry.getKey();
                    if("std_data".equals(key)){
                        dataSource.put(key,entry.getValue());
                    }
                    if ("parameter".equals(key)){
                        std_data.put(key,entry.getValue());
                    }
                    if("field_dataSet".equals(key)){
                        parameter.put(key,entry.getValue());
                    }
                    if("id".equals(key)){
                        field_dataSet.put(key,entry.getValue());
                    }
                    if("name".equals(key)){
                        field_dataSet.put(key,entry.getValue());
                    }
                    if("type".equals(key)){
                        field_dataSet.put(key,entry.getValue());
                    }
                }
                if(!field_dataSet.isEmpty()){
                    field_dataAetArray.add(field_dataSet);
                }
            }
            if(!field_dataAetArray.isEmpty()){
                parameter.put("field_dataSet",field_dataAetArray);
            }
            if(!parameter.isEmpty()){
                std_data.put("parameter",parameter);
            }
            if(!std_data.isEmpty()){
                dataSource.put("std_data",std_data);
            }
        }catch (Exception e){
           e.getStackTrace();
        }
        return ReturnResult.ok(dataSource);
    }
}
