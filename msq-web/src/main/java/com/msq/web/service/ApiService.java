package com.msq.web.service;

import com.msq.common.pojo.SeService;
import com.msq.common.pojo.SeServiceExample;
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
@FeignClient(value = "msq-provider",fallback = HystrixApiServiceHandler.class)
public interface ApiService {
    @RequestMapping(value = "/web-serviceSource/query-list")
    ReturnResult queryList(@RequestBody QueryData<SeServiceExample> queryData);

    @RequestMapping(value = "/web-serviceSource/save-or-update")
    ReturnResult saveOrUpdate(@RequestBody SeService seService);

    @RequestMapping(value = "/web-serviceSource/delete/{id}")
    ReturnResult delete(@PathVariable(value = "id") Long id);
}
