package com.comp.proxy;

import com.comp.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
