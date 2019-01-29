package com.msq.web.service;
import com.msq.common.pojo.SeDataSource;
import com.msq.common.pojo.SeDataSourceExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "msq-provider",fallback = HystrixDataConfigHandler.class)
public interface DataConfigService {

    @RequestMapping(value = "/web-dataSourceConfig/query-list")
    ReturnResult queryList(@RequestBody QueryData<SeDataSourceExample> queryData);

    @RequestMapping(value = "/web-dataSourceConfig/save-or-update")
    ReturnResult saveOrUpdate(@RequestBody SeDataSource seDataSource);

    @RequestMapping(value = "/web-dataSourceConfig/delete")
    ReturnResult delete(@RequestBody SeDataSource seDataSource);

}
