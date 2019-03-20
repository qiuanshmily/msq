package com.msq.provider.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.msq.common.pojo.SeDataSource;
import com.msq.common.pojo.SeSearchSql;
import com.msq.common.pojo.SeService;
import com.msq.common.pojo.SeServiceExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import com.msq.provider.mapper.SeDataSourceMapper;
import com.msq.provider.mapper.SeSearchSqlMapper;
import com.msq.provider.mapper.SeServiceMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @auther:Zhousl
 * @date:2019/1/18
 * @Description:接口服务
 */
@Service
public class ApiServiceImpl {
    @Resource
    private SeServiceMapper seServiceMapper ;
    @Resource
    private SeSearchSqlMapper seSearchSqlMapper;
    @Resource
    private SeDataSourceMapper seDataSourceMapper;

    public ReturnResult queryList(QueryData<SeServiceExample> queryData){
        PageInfo pageInfo = queryData.getPageInfo();
        PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        SeServiceExample param = queryData.getParam();
        List<SeService> seService = seServiceMapper.selectByExample(param);
        PageInfo<SeService> resultInfo=new PageInfo<SeService>(seService);
        return ReturnResult.ok(resultInfo);
    }

    @Transactional
    public ReturnResult saveOrUpdate(SeService seService){
        List<String> serviceIsExist = seServiceMapper.checkServiceIsExist(seService);
        if(serviceIsExist.size()>0){
            return ReturnResult.build(400,"api接口已存在");
        }else {
            if(seService.getServiceId()==null){
                seServiceMapper.insert(seService);
            }else{
                seServiceMapper.updateByPrimaryKeySelective(seService);
            }
            return ReturnResult.ok();
        }

    }

    @Transactional
    public ReturnResult delete(SeService seService){
        seServiceMapper.deleteByIdAndFlag(seService);
        return ReturnResult.ok();
    }

    public Map<String ,Object> queryMap( QueryData<SeServiceExample> queryData){
        Map<String,Object> map = new HashMap();
        SeServiceExample param = queryData.getParam();
        List<SeService> seServices = seServiceMapper.selectByExample(param);

        if(seServices.size()>0){
            SeService seService = seServices.get(0);
            Long searchId = seService.getSearchId();
            SeSearchSql seSearchSql = seSearchSqlMapper.selectByPrimaryKey(searchId);
            Long dataSourceId = seSearchSql.getDataSourceId();
            SeDataSource seDataSource = seDataSourceMapper.selectByPrimaryKey(dataSourceId);
            String sql = seSearchSql.getSearchSql();
            map.put("sql",sql);
            String fieldConfig = seSearchSql.getFieldConfig();
            map.put("fieldConfig",fieldConfig);
            String driverClassName = seDataSource.getDriverClassName();
            map.put("driverClassName",driverClassName);
            String url = seDataSource.getUrl();
            map.put("url",url);
            String username = seDataSource.getUserName();
            map.put("username",username);
            String userPwd = seDataSource.getUserPwd();
            map.put("userPwd",userPwd);
            String library = seDataSource.getLibrary();
            map.put("library",library);
        }
        return map ;
    }

}
