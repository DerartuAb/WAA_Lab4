package waa.waa_lab1.service.Impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import waa.waa_lab1.domain.Post;
import waa.waa_lab1.domain.PostDTO;
import waa.waa_lab1.repo.Impl.PostRepo;
import waa.waa_lab1.repo.PostRepository;
import waa.waa_lab1.service.PostService;

import java.util.List;
@Service
public class PostServiceImpl implements PostService {
    private PostRepository postRepository;

    @Autowired
    ModelMapper modelMapper;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    public List<PostDTO> findAll() {
        //use model mapper to convert list of posts to list of postDTOs
        List<Post> posts = postRepository.findAll();
        List<PostDTO> postDTOS = modelMapper.map(posts, List.class);
        return postDTOS;
    }

    public PostDTO findById(long id) {
        Post post = postRepository.findById(id);
        PostDTO postDTO = modelMapper.map(post, PostDTO.class);
        return postDTO;
    }

    public void save(PostDTO post) {
        ModelMapper modelMapper = new ModelMapper();
        postRepository.save(modelMapper.map(post, Post.class));
    }

    public void deleteById(long id) {
        postRepository.deleteById(id);
    }

    public void update(long id,PostDTO post) {
        ModelMapper modelMapper = new ModelMapper();
        postRepository.update(id,modelMapper.map(post, Post.class));
    }
}
