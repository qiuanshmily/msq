package com.msq.web.service;
import com.msq.common.pojo.SeDataSource;
import com.msq.common.pojo.SeDataSourceExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;

/**
 * @author: create by qiuan
 * @version: v1.0
 * @description: com.msq.web.service
 * @date:2019/1/11
 */
public class HystrixDataConfigHandler implements DataConfigService{


    @Override
    public ReturnResult queryList(QueryData<SeDataSourceExample> queryData) {
        return ReturnResult.build(400,"系统异常");
    }

    @Override
    public ReturnResult saveOrUpdate(SeDataSource seDataSource) {
        return ReturnResult.build(400,"系统异常");
    }

    @Override
    public ReturnResult delete(SeDataSource seDataSource) {
        return ReturnResult.build(400,"系统异常");
    }
}
