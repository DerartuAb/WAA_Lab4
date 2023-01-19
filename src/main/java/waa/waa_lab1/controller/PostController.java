package waa.waa_lab1.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import waa.waa_lab1.domain.Post;
import waa.waa_lab1.domain.PostDTO;
import waa.waa_lab1.service.PostService;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<PostDTO> findAll() {
        return postService.findAll();
    }

    @GetMapping("/{id}")
    public PostDTO findById(@PathVariable long id) {
        return postService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody PostDTO post) {
        postService.save(post);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        postService.deleteById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable long id, @RequestBody PostDTO post) {
        postService.update(id, post);
    }
}