package com.msq.web.controller;

import com.msq.common.pojo.Role;
import com.msq.common.pojo.RoleExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import com.msq.web.service.RoleService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/role")
@RestController
public class RoleController {


    @Autowired
    private RoleService roleService;

    @RequiresPermissions("role:query")
    @RequestMapping("/query-list")
    public ReturnResult queryList(@RequestBody QueryData<RoleExample> queryData){
        ReturnResult returnResult = roleService.queryList(queryData);
        return returnResult;
    }

    @RequiresPermissions("role:edit")
    @RequestMapping("/save-or-update")
    public ReturnResult saveOrUpdate(@RequestBody Role role){
        ReturnResult returnResult = roleService.saveOrUpdate(role);
        return returnResult;
    }

    @RequiresPermissions("role:delete")
    @RequestMapping("/delete/{id}")
    public ReturnResult delete(@PathVariable int id){
        ReturnResult returnResult = roleService.delete(id);
        return returnResult;
    }


    @RequestMapping("/permission-list")
    public ReturnResult permissionList(){
        return roleService.permissionList();
    }

    @RequiresPermissions("role:assign")
    @RequestMapping("/assign-perm")
    public ReturnResult assignPerm(@RequestBody Role role){
        ReturnResult returnResult = roleService.assignPerm(role);
        return returnResult;
    }
}
