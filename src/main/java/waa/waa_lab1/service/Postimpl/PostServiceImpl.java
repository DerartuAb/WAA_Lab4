package waa.waa_lab1.service.Postimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import waa.waa_lab1.domain.Post;
import waa.waa_lab1.repo.PostRepository;
import waa.waa_lab1.service.PostService;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;


    @Override
    public void save(Post post) {
        postRepository.save(post);
    }

    @Override
    public void delete(long id) {
        postRepository.deleteById(id);
    }

    @Override
    public Post getById(long id) {
        return (Post) postRepository.findById(id).get();
    }

    @Override
    public Iterable<Post> findAllPost() {
        return postRepository.findAll();
    }

    @Override
    public List<Post> findAllByTitleEquals(String param) {
        return postRepository.findAllByTitleEquals(param);


    }
}


