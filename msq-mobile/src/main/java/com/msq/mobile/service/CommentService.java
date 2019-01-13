package com.msq.mobile.service;

import com.github.pagehelper.PageInfo;
import com.msq.common.pojo.Comment;
import com.msq.common.util.ReturnResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "msq-provider",fallback = HystrixCommentHandler.class)
public interface CommentService {

    @RequestMapping(value = "/comment/publishComment",method = RequestMethod.POST)
    ReturnResult saveComment(@RequestBody Comment comment);

    @RequestMapping(value = "/comment/getCommentByEssayId/{id}",method = RequestMethod.POST)
    ReturnResult getCommentByEssayId(@PathVariable(value = "id") Long id, @RequestBody PageInfo pageInfo);
}
