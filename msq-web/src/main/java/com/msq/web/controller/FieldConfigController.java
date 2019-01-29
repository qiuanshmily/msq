package com.msq.web.controller;

import com.msq.common.pojo.SeFieldConfig;
import com.msq.common.pojo.SeFieldConfigExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import com.msq.web.service.FieldConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther:Zhousl
 * @date:2019/1/18
 * @Description:字段
 */
@RestController
@RequestMapping("/web-fieldConfig")
public class FieldConfigController {
    @Autowired
    private FieldConfigService fieldConfigService;
    /**
     * 获取字段
     * @param queryData
     * @return
     */
    @RequestMapping("/query-list")
    public ReturnResult queryList(@RequestBody QueryData<SeFieldConfigExample> queryData){
        ReturnResult returnResult = fieldConfigService.queryList(queryData);
        return returnResult;
    }

    @RequestMapping("/save-or-update")
    public ReturnResult saveOrUpdate(@RequestBody SeFieldConfig seFieldConfig){
        ReturnResult returnResult = fieldConfigService.saveOrUpdate(seFieldConfig);
        return returnResult;
    }

    @RequestMapping("/delete")
    public ReturnResult delete(@RequestBody SeFieldConfig seFieldConfig){
        ReturnResult returnResult = fieldConfigService.delete(seFieldConfig);
        return returnResult;
    }

    @RequestMapping("/select-fields/{id}")
    public ReturnResult selectFields(@PathVariable Integer id){
        ReturnResult returnResult = fieldConfigService.selectFields(id);
        return returnResult;
    }

}
