package com.msq.web.controller;

import com.msq.common.pojo.EssayExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import com.msq.web.service.EssayService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/essay")
public class EssayController {


    @Autowired
    private EssayService essayService;

    @RequiresPermissions("essayinfo:query")
    @RequestMapping(value = "/getEssay",method = RequestMethod.POST)
    public ReturnResult getEssay(@RequestBody QueryData<EssayExample> queryData){
        ReturnResult result = essayService.getEssay(queryData);
        return result;
    }




}
