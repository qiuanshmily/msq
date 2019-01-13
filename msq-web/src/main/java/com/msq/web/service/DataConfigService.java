package com.msq.web.service;
import com.github.pagehelper.PageInfo;
import com.msq.common.util.ReturnResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "msq-provider",fallback = HystrixCommentHandler.class)
public interface DataConfigService {

    /**
     * 根据id查询数据库数据
     * @param id
     * @return  ReturnResult
     */
    @RequestMapping(value = "/dataSourceConfig/getDataSources/{id}",method = RequestMethod.POST)
    ReturnResult getDataSourceInfoByUserId(@PathVariable(value = "id") Long id, @RequestBody PageInfo pageInfo);

}
