package com.msq.provider.controller;

import com.github.pagehelper.PageInfo;
import com.msq.common.util.ReturnResult;
import com.msq.provider.service.DataSourceConfigServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.jmx.DataEndpointMBean;
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

    @RequestMapping(value = "/getDataSources/{id}",method = RequestMethod.POST)
    public ReturnResult getDataSourceInfoList(@PathVariable Long id, @RequestBody PageInfo pageInfo){
        ReturnResult result = dataSourceConfigServiceImpl.getDataSourceInfoList(id, pageInfo);
        return result;
    }
}
