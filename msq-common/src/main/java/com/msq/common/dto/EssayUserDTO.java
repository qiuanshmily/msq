package com.msq.common.dto;

import com.msq.common.pojo.Essay;
import com.msq.common.pojo.User;

public class EssayUserDTO extends Essay {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
