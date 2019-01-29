package com.msq.web.service;

import com.msq.common.pojo.SeFieldConfig;
import com.msq.common.pojo.SeFieldConfigExample;
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
@FeignClient(value = "msq-provider",fallback = HystrixFieldConfigHandler.class)
public interface FieldConfigService {
    @RequestMapping(value = "/web-fieldSourceConfig/query-list")
    ReturnResult queryList(@RequestBody QueryData<SeFieldConfigExample> queryData);

    @RequestMapping(value = "/web-fieldSourceConfig/save-or-update")
    ReturnResult saveOrUpdate(@RequestBody SeFieldConfig seFieldConfig);

    @RequestMapping(value = "/web-fieldSourceConfig/delete")
    ReturnResult delete(@RequestBody SeFieldConfig seFieldConfig);

    @RequestMapping(value = "/web-fieldSourceConfig/select-fields/{id}")
    ReturnResult selectFields(@PathVariable(value = "id") Integer id);
}
