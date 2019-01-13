package com.msq.common.dto;

import com.msq.common.pojo.Comment;
import com.msq.common.pojo.User;

public class CommentUserDTO extends Comment {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
