package com.msq.provider.controller;

import com.msq.common.pojo.SeDataSource;
import com.msq.common.pojo.SeDataSourceExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import com.msq.provider.service.DataSourceConfigServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: create by qiuan
 * @version: v1.0
 * @description: com.msq.provider.controller
 * @date:2019/1/12
 */
@RestController
@RequestMapping("/dataSourceConfig")
public class DataSourceConfig {
    @Autowired
    private DataSourceConfigServiceImpl dataSourceConfigServiceImpl;


    @RequestMapping(value = "/query-list")
    public ReturnResult queryList(@RequestBody QueryData<SeDataSourceExample> queryData){
        ReturnResult returnResult = dataSourceConfigServiceImpl.queryList(queryData);
        return returnResult;
    }

    @RequestMapping("/save-or-update")
    public ReturnResult saveOrUpdate(@RequestBody SeDataSource seDataSource){
        ReturnResult returnResult = dataSourceConfigServiceImpl.saveOrUpdate(seDataSource);
        return returnResult;
    }


    @RequestMapping("/delete/{id}")
    public ReturnResult delete(@PathVariable Long id){
        ReturnResult returnResult = dataSourceConfigServiceImpl.delete(id);
        return returnResult;
    }
}
