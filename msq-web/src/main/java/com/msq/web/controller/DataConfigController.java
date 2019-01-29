package com.msq.web.controller;
import com.msq.common.pojo.SeDataSource;
import com.msq.common.pojo.SeDataSourceExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import com.msq.web.service.DataConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: qiuan
 * @Date: 2019/1/11 15:02
 * @Description: 数据初始化配置服务
 */
@RestController
@RequestMapping("/web-dataConfig")
public class DataConfigController {

    @Autowired
    private DataConfigService dataConfigService;
    /**
     * 通过相应用户ID获取数据模组
     * @param queryData
     * @return
     */
    @RequestMapping("/query-list")
    public ReturnResult queryList(@RequestBody QueryData<SeDataSourceExample> queryData){
        ReturnResult returnResult = dataConfigService.queryList(queryData);
        return returnResult;
    }

    @RequestMapping("/save-or-update")
    public ReturnResult saveOrUpdate(@RequestBody SeDataSource seDataSource){
        ReturnResult returnResult = dataConfigService.saveOrUpdate(seDataSource);
        return returnResult;
    }

    @RequestMapping("/delete")
    public ReturnResult delete(@RequestBody SeDataSource seDataSource){
        ReturnResult returnResult = dataConfigService.delete(seDataSource);
        return returnResult;
    }


}

