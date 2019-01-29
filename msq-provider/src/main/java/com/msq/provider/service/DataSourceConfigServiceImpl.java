package com.msq.provider.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.msq.common.pojo.SeDataSource;
import com.msq.common.pojo.SeDataSourceExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import com.msq.provider.mapper.SeDataSourceMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: create by qiuan
 * @version: v1.0
 * @description: com.msq.provider.service
 * @date:2019/1/12
 */
@Service
public class DataSourceConfigServiceImpl {

    @Resource
    private SeDataSourceMapper seDataSourceMapper;

    public ReturnResult queryList(QueryData<SeDataSourceExample> queryData){
        PageInfo pageInfo = queryData.getPageInfo();
        PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        SeDataSourceExample param = queryData.getParam();
        List<SeDataSource> seDataSource = seDataSourceMapper.selectByExample(param);
        PageInfo<SeDataSource> resultInfo=new PageInfo<SeDataSource>(seDataSource);
        return ReturnResult.ok(resultInfo);
    }

    @Transactional
    public ReturnResult saveOrUpdate(SeDataSource seDataSource){
        if(seDataSource.getDataSourceId()==null){
            seDataSourceMapper.insert(seDataSource);
        }else{
            seDataSourceMapper.updateByPrimaryKey(seDataSource);
        }
        return ReturnResult.ok();
    }

    @Transactional
    public ReturnResult delete(SeDataSource seDataSource){
        int flag = seDataSourceMapper.deleteByPrimaryKey(seDataSource);
        if(1==flag){
            return ReturnResult.ok();
        }else{
            return ReturnResult.build(400,"参数错误");
        }

    }
}
