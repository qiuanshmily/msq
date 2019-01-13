package com.msq.zuul.service;

import com.msq.common.pojo.WebUser;
import com.msq.common.util.ReturnResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "msq-provider",fallback = HystrixWebUserHandler.class)
public interface WebUserService {


    @RequestMapping(value="/web-user/login",method = RequestMethod.POST)
    ReturnResult<WebUser> login(@RequestParam(value = "account") String account, @RequestParam(value = "password") String password);

}
