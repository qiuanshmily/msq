package com.msq.web.service;

import com.msq.common.pojo.Essay;
import com.msq.common.pojo.EssayExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import org.springframework.stereotype.Component;

@Component
public class HystrixEssayHandler implements EssayService{


    @Override
    public ReturnResult saveEssay(Essay essay) {
        return ReturnResult.build(400,"系统异常");
    }

    @Override
    public ReturnResult getEssay(QueryData<EssayExample> queryData) {
        return ReturnResult.build(400,"系统异常");
    }
}
