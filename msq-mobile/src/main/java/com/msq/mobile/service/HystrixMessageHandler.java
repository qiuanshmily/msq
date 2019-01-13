package com.msq.mobile.service;

import com.github.pagehelper.PageInfo;
import com.msq.common.pojo.Essay;
import com.msq.common.pojo.Message;
import com.msq.common.util.ReturnResult;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class HystrixMessageHandler implements MessageService{



    @Override
    public ReturnResult insertMessage(Message message) {
        return ReturnResult.build(400,"系统异常");
    }

    @Override
    public ReturnResult getMessage(Long userId, Long otherUserId, Date time, PageInfo pageInfo) {
        return ReturnResult.build(400,"系统异常");
    }
}
