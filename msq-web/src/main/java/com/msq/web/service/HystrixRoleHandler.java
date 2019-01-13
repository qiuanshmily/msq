package com.msq.web.service;

import com.msq.common.pojo.Role;
import com.msq.common.pojo.RoleExample;
import com.msq.common.pojo.WebUser;
import com.msq.common.pojo.WebUserExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import org.springframework.stereotype.Component;


@Component
public class HystrixRoleHandler implements RoleService{


    @Override
    public ReturnResult queryList(QueryData<RoleExample> queryData) {
        return ReturnResult.build(400,"系统异常");
    }

    @Override
    public ReturnResult saveOrUpdate(Role role) {
        return ReturnResult.build(400,"系统异常");
    }

    @Override
    public ReturnResult delete(int id) {
        return ReturnResult.build(400,"系统异常");
    }

    @Override
    public ReturnResult permissionList() {
        return ReturnResult.build(400,"系统异常");
    }

    @Override
    public ReturnResult assignPerm(Role role) {
        return ReturnResult.build(400,"系统异常");
    }
}
