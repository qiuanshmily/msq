package com.msq.provider.controller;

import com.msq.common.pojo.SeService;
import com.msq.common.pojo.SeServiceExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import com.msq.provider.service.ApiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @auther:Zhousl
 * @date:2019/1/18
 * @Description:
 */
@RestController
@RequestMapping("/web-serviceSource")
public class ApiServiceController {
    @Autowired
    private ApiServiceImpl apiServiceImpl;


    @RequestMapping(value = "/query-list")
    public ReturnResult queryList(@RequestBody QueryData<SeServiceExample> queryData){
        ReturnResult returnResult = apiServiceImpl.queryList(queryData);
        return returnResult;
    }

    @RequestMapping("/save-or-update")
    public ReturnResult saveOrUpdate(@RequestBody SeService seService){
        ReturnResult returnResult = apiServiceImpl.saveOrUpdate(seService);
        return returnResult;
    }

    @RequestMapping("/delete")
    public ReturnResult delete(@RequestBody SeService seService){
        ReturnResult returnResult = apiServiceImpl.delete(seService);
        return returnResult;
    }

    @RequestMapping("/api-query")
    public Map<String,Object> apiQuery(@RequestBody QueryData<SeServiceExample> queryData){
        Map<String,Object> map = apiServiceImpl.queryMap(queryData);
        return map;
    }


}
