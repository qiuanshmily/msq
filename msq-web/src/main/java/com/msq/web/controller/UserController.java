package com.msq.web.controller;


import com.msq.common.pojo.UserExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import com.msq.web.service.UserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private static Logger logger= LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;


    @RequiresPermissions("userinfo:query")
    @RequestMapping("/getUserList")
    public ReturnResult getUserList(@RequestBody QueryData<UserExample> queryData)throws Exception{
        logger.info("获取用户信息列表接口--------------");
        ReturnResult result = userService.getUserList(queryData);
        return result;
    }




}