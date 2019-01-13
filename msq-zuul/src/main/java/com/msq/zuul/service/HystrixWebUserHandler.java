package com.msq.zuul.service;

import com.msq.common.pojo.WebUser;
import com.msq.common.util.ReturnResult;
import org.springframework.stereotype.Component;


@Component
public class HystrixWebUserHandler implements WebUserService{


    @Override
    public ReturnResult<WebUser> login(String account, String password) {
        return ReturnResult.build(400,"系统异常");
    }

}
