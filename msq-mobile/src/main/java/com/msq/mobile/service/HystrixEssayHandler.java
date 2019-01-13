package com.msq.mobile.service;

import com.msq.common.pojo.Essay;
import com.msq.common.pojo.EssayExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public class HystrixEssayHandler implements EssayService{


    @Override
    public ReturnResult saveEssay(Essay essay) {
        return ReturnResult.build(400,"系统异常");
    }

    @Override
    public ReturnResult getEssay(@RequestBody QueryData<EssayExample> queryData) {
        return ReturnResult.build(400,"系统异常");
    }
}
