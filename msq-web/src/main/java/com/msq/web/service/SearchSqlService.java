package com.msq.web.service;

import com.msq.common.pojo.SeSearchSql;
import com.msq.common.pojo.SeSearchSqlExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther:Zhousl
 * @date:2019/1/18
 * @Description:
 */
@FeignClient(value = "msq-provider",fallback = HystrixSearchSqlHandler.class)
public interface SearchSqlService {
    @RequestMapping(value = "/web-searchSqlSource/query-list")
    ReturnResult queryList(@RequestBody QueryData<SeSearchSqlExample> queryData);

    @RequestMapping(value = "/web-searchSqlSource/save-or-update")
    ReturnResult saveOrUpdate(@RequestBody SeSearchSql seSearchSql);

    @RequestMapping(value = "/web-searchSqlSource/delete")
    ReturnResult delete(@RequestBody SeSearchSql seSearchSql);
}
