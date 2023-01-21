package waa.waa_lab1.service.Commentimpl;

import waa.waa_lab1.domain.Comment;

import java.util.List;

public interface CommentService {
    public List<Comment> findAll();
    public  Comment findById(Long id);
    public void save(Comment c);
    public void delete(Long id);
}









