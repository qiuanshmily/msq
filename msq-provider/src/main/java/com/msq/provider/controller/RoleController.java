package com.msq.provider.controller;

import com.msq.common.dto.PermissionDTO;
import com.msq.common.pojo.Role;
import com.msq.common.pojo.RoleExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import com.msq.provider.service.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/role")
@RestController
public class RoleController {


    @Autowired
    private RoleServiceImpl roleServiceImpl;


    @RequestMapping("/query-list")
    public ReturnResult queryList(@RequestBody QueryData<RoleExample> queryData){
        ReturnResult returnResult = roleServiceImpl.queryList(queryData);
        return returnResult;
    }


    @RequestMapping("/save-or-update")
    public ReturnResult saveOrUpdate(@RequestBody Role role){
        ReturnResult returnResult = roleServiceImpl.saveOrUpdate(role);
        return returnResult;
    }

    @RequestMapping("/delete/{id}")
    public ReturnResult delete(@PathVariable int id){
        ReturnResult returnResult = roleServiceImpl.delete(id);
        return returnResult;
    }

    @RequestMapping("/permission-list")
    public ReturnResult permissionList(){
        return roleServiceImpl.permissionList();
    }

    @RequestMapping("/assign-perm")
    public ReturnResult assignPerm(@RequestBody Role role){
        ReturnResult returnResult = roleServiceImpl.assignPerm(role);
        return returnResult;
    }
}
