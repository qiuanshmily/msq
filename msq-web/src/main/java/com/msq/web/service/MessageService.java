package com.msq.web.service;

import com.github.pagehelper.PageInfo;
import com.msq.common.dto.UsersMessagesDTO;
import com.msq.common.pojo.Message;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(value = "msq-provider",fallback = HystrixMessageHandler.class)
public interface MessageService {


    @RequestMapping(value = "/message/getMessage/{userId}/{otherUserId}/{time}",method = RequestMethod.POST)
    ReturnResult getMessage(@PathVariable(value = "userId") Long userId, @PathVariable(value = "otherUserId") Long otherUserId,
                            @PathVariable(value = "time") Date time,
                            @RequestBody PageInfo pageInfo);


    @RequestMapping(value = "/message/get-users-message")
    ReturnResult getUsersMessage(@RequestBody QueryData<UsersMessagesDTO> queryData);


}
