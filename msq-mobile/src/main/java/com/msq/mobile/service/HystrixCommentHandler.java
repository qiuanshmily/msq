package com.msq.mobile.service;

import com.github.pagehelper.PageInfo;
import com.msq.common.pojo.Comment;
import com.msq.common.util.ReturnResult;
import org.springframework.stereotype.Component;

@Component
public class HystrixCommentHandler implements CommentService{


    @Override
    public ReturnResult saveComment(Comment comment) {
        return ReturnResult.build(400,"系统异常");
    }

    @Override
    public ReturnResult getCommentByEssayId(Long id, PageInfo pageInfo) {
        return ReturnResult.build(400,"系统异常");
    }
}
