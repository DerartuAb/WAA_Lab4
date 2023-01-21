package waa.waa_lab1.service;

import waa.waa_lab1.domain.Post;

import java.util.List;

public interface PostService {

    public void save(Post post);
    public void delete(long id);
    public Post getById(long id);
    public Iterable<Post> findAllPost();
    public List<Post> findAllByTitleEquals(String param);
}
