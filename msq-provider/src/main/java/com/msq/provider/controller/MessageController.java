package com.msq.provider.controller;

import com.github.pagehelper.PageInfo;
import com.msq.common.dto.UsersMessagesDTO;
import com.msq.common.pojo.Message;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import com.msq.provider.service.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageServiceImpl messageServiceImpl;


    @RequestMapping(value = "/saveMessage",method = RequestMethod.POST)
    public ReturnResult saveMessage(@RequestBody Message message){
        ReturnResult result = messageServiceImpl.insertMessage(message);
        return result;
    }


    @RequestMapping(value="/getMessage/{userId}/{otherUserId}/{time}",method = RequestMethod.POST)
    public ReturnResult getMessage(@PathVariable Long userId, @PathVariable Long otherUserId,
                                   @PathVariable Date time,
                                   @RequestBody PageInfo pageInfo){
        ReturnResult result = messageServiceImpl.getMessage(userId, otherUserId, time,pageInfo);
        return result;
    }


    @RequestMapping(value = "/get-users-message",method = RequestMethod.POST)
    public ReturnResult getUsersMessage(@RequestBody QueryData<UsersMessagesDTO> queryData){
        ReturnResult result = messageServiceImpl.getUsersMessage(queryData);
        return result;
    }
}
