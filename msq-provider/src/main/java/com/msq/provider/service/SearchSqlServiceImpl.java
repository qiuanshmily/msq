package com.msq.provider.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.msq.common.pojo.SeSearchSql;
import com.msq.common.pojo.SeSearchSqlExample;
import com.msq.common.util.MatchesField;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import com.msq.provider.mapper.SeSearchSqlMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther:Zhousl
 * @date:2019/1/18
 * @Description:
 */
@Service
public class SearchSqlServiceImpl {
    @Resource
    private SeSearchSqlMapper seSearchSqlMapper ;

    public ReturnResult queryList(QueryData<SeSearchSqlExample> queryData){
        PageInfo pageInfo = queryData.getPageInfo();
        PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        SeSearchSqlExample param = queryData.getParam();
        List<SeSearchSql> seSearchSql = seSearchSqlMapper.selectByExample(param);
        PageInfo<SeSearchSql> resultInfo=new PageInfo<SeSearchSql>(seSearchSql);
        return ReturnResult.ok(resultInfo);
    }

    @Transactional
    public ReturnResult saveOrUpdate(SeSearchSql seSearchSql){
        List<String> sqlIsExist = seSearchSqlMapper.checkSqlExist(seSearchSql);
        if(sqlIsExist.size()>0){
            return ReturnResult.build(400,"sql名称已存在");
        }else {
            if(seSearchSql.getSearchId()==null){
                String fields = MatchesField.queryFieldList(seSearchSql.getSearchSql());
                seSearchSql.setFieldConfig(fields);
                seSearchSqlMapper.insert(seSearchSql);
            }else{
                seSearchSqlMapper.updateByPrimaryKeySelective(seSearchSql);
            }
            return ReturnResult.ok();
        }

    }

    @Transactional
    public ReturnResult delete(SeSearchSql seSearchSql){
        int flag = seSearchSqlMapper.deleteByPrimaryKey(seSearchSql);
        if(1==flag){
            return ReturnResult.ok();
        }else{
            return ReturnResult.build(400,"参数有误");
        }

    }
}
