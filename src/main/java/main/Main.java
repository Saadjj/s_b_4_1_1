package main;

import models.Comment;
import proxies.EmailCommentNotification;
import repositories.DBCommentRepository;
import services.CommentServices;

public class Main {
    public static void main(String[] args) {

        var commentRepository=
                new DBCommentRepository();
        var commentNotificationProxy=
                new EmailCommentNotification();
        var commentService=
                new CommentServices(
                        commentRepository,
                        commentNotificationProxy);

        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");

        commentService.publishComment(comment);


        }
    }

