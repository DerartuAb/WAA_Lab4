package waa.waa_lab1.service;

import waa.waa_lab1.domain.PostDTO;

import java.util.List;

public interface PostService {

    //add the method signatures here

    public List<PostDTO> findAll();
    public PostDTO findById(long id);
    public void save(PostDTO post);
    public void deleteById(long id);
    public void update(long id,PostDTO post);

}
