package com.msq.mobile.service;

import com.msq.common.pojo.Essay;
import com.msq.common.pojo.EssayExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "msq-provider",fallback = HystrixEssayHandler.class)
public interface EssayService {

    @RequestMapping(value = "/essay/saveEssay",method = RequestMethod.POST)
    ReturnResult saveEssay(@RequestBody Essay essay);

    @RequestMapping(value = "/essay/getEssay",method = RequestMethod.POST)
    ReturnResult getEssay(@RequestBody QueryData<EssayExample> queryData);
}
