package com.msq.provider.controller;

import com.msq.common.pojo.SeSearchSql;
import com.msq.common.pojo.SeSearchSqlExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import com.msq.provider.service.SearchSqlServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther:Zhousl
 * @date:2019/1/18
 * @Description:
 */
@RestController
@RequestMapping("/web-searchSqlSource")
public class SearchSqlController {
    @Autowired
    private SearchSqlServiceImpl searchSqlServiceImpl;


    @RequestMapping(value = "/query-list")
    public ReturnResult queryList(@RequestBody QueryData<SeSearchSqlExample> queryData){
        ReturnResult returnResult = searchSqlServiceImpl.queryList(queryData);
        return returnResult;
    }

    @RequestMapping("/save-or-update")
    public ReturnResult saveOrUpdate(@RequestBody SeSearchSql seSearchSql){
        ReturnResult returnResult = searchSqlServiceImpl.saveOrUpdate(seSearchSql);
        return returnResult;
    }

    @RequestMapping("/delete")
    public ReturnResult delete(@RequestBody SeSearchSql seSearchSql){
        ReturnResult returnResult = searchSqlServiceImpl.delete(seSearchSql);
        return returnResult;
    }

}
