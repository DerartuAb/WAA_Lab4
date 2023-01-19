package waa.waa_lab1.repo;

import waa.waa_lab1.domain.Post;

import java.util.List;

public interface PostRepository {
    List<Post> findAll();
    Post findById(long id);
    void save(Post post);
    void deleteById(long id);
    void update(long id,Post post);
}


