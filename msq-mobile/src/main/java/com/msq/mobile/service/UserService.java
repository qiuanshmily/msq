package com.msq.mobile.service;

import com.msq.common.pojo.User;
import com.msq.common.pojo.UserExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "msq-provider",fallback = HystrixUserHandler.class)
public interface UserService {

    @RequestMapping(value="/user/login",method = RequestMethod.POST)
    ReturnResult<User> login(@RequestParam(value = "account") String account, @RequestParam(value = "password") String password);

    @RequestMapping(value = "/user/register",method = RequestMethod.POST)
    ReturnResult register(@RequestBody User user);

    @RequestMapping("/user/getUserList")
    ReturnResult getUserList(@RequestBody QueryData<UserExample> queryData);

    @RequestMapping(value = "/user/updateUser",method = RequestMethod.POST)
    ReturnResult<String> updateUser(@RequestBody User user);
}
