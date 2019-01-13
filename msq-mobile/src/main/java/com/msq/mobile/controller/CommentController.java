package com.msq.mobile.controller;

import com.github.pagehelper.PageInfo;
import com.msq.common.pojo.Comment;
import com.msq.common.pojo.User;
import com.msq.common.util.ReturnResult;
import com.msq.mobile.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/publishComment",method = RequestMethod.POST)
    public ReturnResult publishComment(HttpServletRequest request, @RequestBody Comment comment){
        User user=(User) request.getAttribute("user");

        comment.setUserId(user.getId());

        ReturnResult result = commentService.saveComment(comment);
        return result;
    }


    @RequestMapping(value = "/getCommentByEssayId/{id}",method = RequestMethod.POST)
    public ReturnResult getCommentByEssayId(@PathVariable Long id, @RequestBody PageInfo pageInfo){
        ReturnResult result = commentService.getCommentByEssayId(id, pageInfo);
        return result;
    }




}
