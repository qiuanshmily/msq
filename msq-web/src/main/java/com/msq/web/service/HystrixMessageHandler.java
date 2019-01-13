package com.msq.web.service;

import com.github.pagehelper.PageInfo;
import com.msq.common.dto.UsersMessagesDTO;
import com.msq.common.pojo.Message;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class HystrixMessageHandler implements MessageService{




    @Override
    public ReturnResult getMessage(Long userId, Long otherUserId, Date time, PageInfo pageInfo) {
        return ReturnResult.build(400,"系统异常");
    }

    @Override
    public ReturnResult getUsersMessage(QueryData<UsersMessagesDTO> queryData) {
        return ReturnResult.build(400,"系统异常");
    }
}
