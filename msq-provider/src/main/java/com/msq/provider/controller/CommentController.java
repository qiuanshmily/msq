package com.msq.provider.controller;

import com.github.pagehelper.PageInfo;
import com.msq.common.pojo.Comment;
import com.msq.common.util.ReturnResult;
import com.msq.provider.service.CommentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentServiceImpl commentServiceImpl;

    @RequestMapping(value = "/publishComment",method = RequestMethod.POST)
    public ReturnResult publishComment(@RequestBody Comment comment){
        ReturnResult result = commentServiceImpl.saveComment(comment);
        return result;
    }


    @RequestMapping(value = "/getCommentByEssayId/{id}",method = RequestMethod.POST)
    public ReturnResult getCommentByEssayId(@PathVariable Long id, @RequestBody PageInfo pageInfo){
        ReturnResult result = commentServiceImpl.getCommentByEssayId(id, pageInfo);
        return result;
    }




}
