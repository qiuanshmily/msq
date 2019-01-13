package com.msq.provider.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.msq.common.dto.CommentUserDTO;
import com.msq.common.pojo.Comment;
import com.msq.common.util.ReturnResult;
import com.msq.provider.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CommentServiceImpl  {

    @Autowired
    private CommentMapper commentMapper;

    @Transactional
    public ReturnResult saveComment(Comment comment) {
        int insert = commentMapper.insert(comment);
        if(insert>0){
            return ReturnResult.ok();
        }
        return ReturnResult.build(400,"发表评论失败");
    }

    public ReturnResult getCommentByEssayId(Long essayId, PageInfo pageInfo) {
        PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        List<CommentUserDTO> commentUserDTOS = commentMapper.listCommentUser(essayId);
        PageInfo<CommentUserDTO> resultInfo=new PageInfo<CommentUserDTO>(commentUserDTOS);
        return ReturnResult.ok(resultInfo);
    }
}