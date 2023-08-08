package proxies;

import models.Comment;
import repositories.CommentRepository;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
