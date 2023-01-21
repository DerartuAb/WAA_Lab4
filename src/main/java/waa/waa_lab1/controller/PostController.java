package waa.waa_lab1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import waa.waa_lab1.domain.Post;
import waa.waa_lab1.service.PostService;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping

    public Iterable<Post> getAllPosts(){
        return postService.findAllPost();
    }

    @PostMapping
    public void save(@RequestBody Post post){
        postService.save(post);
    }

    @GetMapping("/{id}")
    public Post getPostById(@PathVariable long id){
        return postService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        postService.delete(id);
    }
    @GetMapping("/fitler")
    public List<Post> getMatchedPosts(@RequestParam(value = "text") String param){
        return postService.findAllByTitleEquals(param);
    }
}


