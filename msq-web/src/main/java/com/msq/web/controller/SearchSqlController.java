package com.msq.web.controller;

import com.msq.common.pojo.SeSearchSql;
import com.msq.common.pojo.SeSearchSqlExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import com.msq.web.service.SearchSqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther:Zhousl
 * @date:2019/1/18
 * @Description:
 */
@RestController
@RequestMapping("/web-searchSql")
public class SearchSqlController {
    @Autowired
    private SearchSqlService searchSqlService;
    /**
     * 获取sql
     * @param queryData
     * @return
     */
    @RequestMapping("/query-list")
    public ReturnResult queryList(@RequestBody QueryData<SeSearchSqlExample> queryData){
        ReturnResult returnResult = searchSqlService.queryList(queryData);
        return returnResult;
    }

    @RequestMapping("/save-or-update")
    public ReturnResult saveOrUpdate(@RequestBody SeSearchSql seSearchSql){
        ReturnResult returnResult = searchSqlService.saveOrUpdate(seSearchSql);
        return returnResult;
    }

    @RequestMapping("/delete")
    public ReturnResult delete(@RequestBody SeSearchSql seSearchSql){
        ReturnResult returnResult = searchSqlService.delete(seSearchSql);
        return returnResult;
    }
}
