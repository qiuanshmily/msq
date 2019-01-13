package com.msq.web.service;

import com.msq.common.pojo.WebUser;
import com.msq.common.pojo.WebUserExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "msq-provider",fallback = HystrixWebUserHandler.class)
public interface WebUserService {


    @RequestMapping(value="/web-user/login",method = RequestMethod.POST)
    ReturnResult<WebUser> login(@RequestParam(value = "account") String account, @RequestParam(value = "password") String password);


    @RequestMapping(value = "/web-user/query-list")
    ReturnResult queryList(@RequestBody QueryData<WebUserExample> queryData);

    @RequestMapping(value = "/web-user/save-or-update")
    ReturnResult saveOrUpdate(@RequestBody WebUser webUser);

    @RequestMapping(value = "/web-user/delete/{id}")
    ReturnResult delete(@PathVariable(value = "id") Long id);

    @RequestMapping(value = "/web-user/assign-role")
    ReturnResult assignRole(@RequestBody WebUser webUser);


}
