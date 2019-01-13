package com.msq.web.service;

import com.msq.common.pojo.WebUser;
import com.msq.common.pojo.WebUserExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;


@Component
public class HystrixWebUserHandler implements WebUserService{


    @Override
    public ReturnResult<WebUser> login(String account, String password) {
        return ReturnResult.build(400,"系统异常");
    }

    @Override
    public ReturnResult queryList(@RequestBody QueryData<WebUserExample> queryData){
        return ReturnResult.build(400,"系统异常");
    }

    @Override
    public ReturnResult saveOrUpdate(WebUser webUser) {
        return ReturnResult.build(400,"系统异常");
    }

    @Override
    public ReturnResult delete(Long id) {
        return ReturnResult.build(400,"系统异常");
    }

    @Override
    public ReturnResult assignRole(WebUser webUser) {
        return ReturnResult.build(400,"系统异常");
    }


}
