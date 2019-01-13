package com.msq.web.controller;

import com.github.pagehelper.PageInfo;
import com.msq.common.pojo.Comment;
import com.msq.common.pojo.User;
import com.msq.common.util.ReturnResult;
import com.msq.web.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;


    @RequestMapping(value = "/getCommentByEssayId/{id}",method = RequestMethod.POST)
    public ReturnResult getCommentByEssayId(@PathVariable Long id, @RequestBody PageInfo pageInfo){
        ReturnResult result = commentService.getCommentByEssayId(id, pageInfo);
        return result;
    }




}
