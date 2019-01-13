package com.msq.web.service;

import com.msq.common.pojo.UserExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "msq-provider",fallback = HystrixUserHandler.class)
public interface UserService {


    @RequestMapping("/user/getUserList")
    ReturnResult getUserList(@RequestBody QueryData<UserExample> queryData);

}
