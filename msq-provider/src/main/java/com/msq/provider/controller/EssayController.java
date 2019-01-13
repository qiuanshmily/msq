package com.msq.provider.controller;

import com.msq.common.pojo.Essay;
import com.msq.common.pojo.EssayExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import com.msq.provider.service.EssayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/essay")
public class EssayController {

    @Autowired
    private EssayServiceImpl essayServiceImpl;



    @RequestMapping(value = "/saveEssay",method = RequestMethod.POST)
    public ReturnResult saveEssay(@RequestBody Essay essay){
        ReturnResult result = essayServiceImpl.saveEssay(essay);
        return result;
    }

    @RequestMapping(value = "/getEssay",method = RequestMethod.POST)
    public ReturnResult getEssay(@RequestBody QueryData<EssayExample> queryData){
        ReturnResult result = essayServiceImpl.getEssay(queryData);
        return result;
    }






}
