package waa.waa_lab1.repo.Impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import waa.waa_lab1.domain.Post;
import waa.waa_lab1.repo.PostRepository;

@Repository
public class PostRepo implements PostRepository {
    private List<Post> posts = new ArrayList<>();

    //populate the posts list with some data
    public PostRepo() {
        posts.add(new Post(1, "Post 1", "Post 1 Description", "Author 1"));
        posts.add(new Post(2, "Post 2", "Post 2 Description", "Author 2"));
        posts.add(new Post(3, "Post 3", "Post 3 Description", "Author 3"));
    }

    public List<Post> findAll() {
        return posts;
    }

    public Post findById(long id) {
        for (Post post : posts) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }

    public void save(Post post) {
        posts.add(post);
    }

    public void deleteById(long id) {
        posts.removeIf(post -> post.getId() == id);
    }

    public void update(long id,Post post) {
        for (Post p : posts) {
            if (p.getId() == id) {
                p.setTitle(post.getTitle());
                p.setContent(post.getContent());
                p.setAuthor(post.getAuthor());
            }
        }
    }
}


