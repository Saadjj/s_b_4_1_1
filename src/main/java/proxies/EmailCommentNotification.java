package proxies;

import models.Comment;

public class EmailCommentNotification implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println(" Sending notification for comment : "+ comment.getText());
    }
}
