package services;

import models.Comment;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

public class CommentServices {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentServices(
            CommentRepository commentRepository,
            CommentNotificationProxy commentNotificationProxy
    ){
        this.commentNotificationProxy=commentNotificationProxy;
        this.commentRepository=commentRepository;
    }
    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
