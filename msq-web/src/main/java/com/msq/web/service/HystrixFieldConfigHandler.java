package com.msq.web.service;

import com.msq.common.pojo.SeFieldConfig;
import com.msq.common.pojo.SeFieldConfigExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;

/**
 * @auther:Zhousl
 * @date:2019/1/18
 * @Description:
 */
public class HystrixFieldConfigHandler implements  FieldConfigService {
    @Override
    public ReturnResult queryList(QueryData<SeFieldConfigExample> queryData) {
        return ReturnResult.build(400,"系统异常");
    }

    @Override
    public ReturnResult saveOrUpdate(SeFieldConfig seFieldConfig) {
        return ReturnResult.build(400,"系统异常");
    }

    @Override
    public ReturnResult delete(SeFieldConfig seFieldConfig) {
        return ReturnResult.build(400,"系统异常");
    }

    @Override
    public ReturnResult selectFields(Integer id){return ReturnResult.build(400,"系统异常");}
}
