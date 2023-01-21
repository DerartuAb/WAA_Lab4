package waa.waa_lab1.service.Commentimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import waa.waa_lab1.domain.Comment;
import waa.waa_lab1.repo.CommentRepository;

import java.util.List;
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<Comment> findAll() {
        return (List<Comment>)commentRepository.findAll();
    }

    @Override
    public Comment findById(Long id) {
        return (Comment) commentRepository.findById(id).get();
    }

    @Override
    public void save(Comment c) {
        commentRepository.save(c);

    }

    @Override
    public void delete(Long id) {
        commentRepository.deleteById(id);
    }


}
