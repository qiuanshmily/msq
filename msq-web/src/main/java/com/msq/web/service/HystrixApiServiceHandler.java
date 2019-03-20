package com.msq.web.service;

import com.msq.common.pojo.SeService;
import com.msq.common.pojo.SeServiceExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import java.util.Map;

/**
 * @auther:Zhousl
 * @date:2019/1/18
 * @Description:
 */
public class HystrixApiServiceHandler implements ApiService {
    @Override
    public ReturnResult queryList(QueryData<SeServiceExample> queryData) {
        return ReturnResult.build(400,"系统异常");
    }

    @Override
    public ReturnResult saveOrUpdate(SeService seService) {
        return ReturnResult.build(400,"系统异常");
    }

    @Override
    public ReturnResult delete(SeService seService) {
        return ReturnResult.build(400,"系统异常");
    }

    @Override
    public Map<String,Object> apiQuery(QueryData<SeServiceExample> queryData){return null;}



}
