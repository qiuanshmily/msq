package com.msq.web.service;

import com.msq.common.pojo.SeSearchSql;
import com.msq.common.pojo.SeSearchSqlExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;

/**
 * @auther:Zhousl
 * @date:2019/1/18
 * @Description:
 */
public class HystrixSearchSqlHandler implements SearchSqlService {
    @Override
    public ReturnResult queryList(QueryData<SeSearchSqlExample> queryData) {
        return ReturnResult.build(400,"系统异常");
    }

    @Override
    public ReturnResult saveOrUpdate(SeSearchSql seSearchSql) {
        return ReturnResult.build(400,"系统异常");
    }

    @Override
    public ReturnResult delete(SeSearchSql seSearchSql) {
        return ReturnResult.build(400,"系统异常");
    }
}
