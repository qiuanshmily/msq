package com.msq.web.service;

import com.msq.common.pojo.UserExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;


@Component
public class HystrixUserHandler implements UserService{

    @Override
    public ReturnResult getUserList(@RequestBody QueryData<UserExample> queryData) {
        return ReturnResult.build(400,"系统异常");
    }

}
