package com.msq.provider.controller;

import com.msq.common.pojo.SeFieldConfig;
import com.msq.common.pojo.SeFieldConfigExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import com.msq.provider.service.FieldConfigServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther:Zhousl
 *  @version: v1.0
 * @date:2019/1/18
 * @Description:com.msq.provider.controller
 */
@RestController
@RequestMapping("/web-fieldSourceConfig")
public class FieldConfigController {
    @Autowired
    private FieldConfigServiceImpl fieldConfigServiceImpl;


    @RequestMapping(value = "/query-list")
    public ReturnResult queryList(@RequestBody QueryData<SeFieldConfigExample> queryData){
        ReturnResult returnResult = fieldConfigServiceImpl.queryList(queryData);
        return returnResult;
    }

    @RequestMapping("/save-or-update")
    public ReturnResult saveOrUpdate(@RequestBody SeFieldConfig seFieldConfig){
        ReturnResult returnResult = fieldConfigServiceImpl.saveOrUpdate(seFieldConfig);
        return returnResult;
    }

    @RequestMapping("/delete")
    public ReturnResult delete(@RequestBody SeFieldConfig seFieldConfig){
        ReturnResult returnResult = fieldConfigServiceImpl.delete(seFieldConfig);
        return returnResult;
    }

    @RequestMapping("/select-fields/{id}")
    public ReturnResult selectFields(@PathVariable Integer id){
        ReturnResult returnResult = fieldConfigServiceImpl.selectFields(id);
        return returnResult;
    }

}
