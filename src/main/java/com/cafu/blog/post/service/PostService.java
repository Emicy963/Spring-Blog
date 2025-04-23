package com.cafu.blog.post.service;

import com.cafu.blog.post.model.Post;
import com.cafu.blog.post.repository.PostInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostInterface postInterface;

    public PostService(PostInterface postInterface){
        this.postInterface = postInterface;
    }

    public Post createPost(Post post){
        return postInterface.save(post);
    }
        
    public Optional<Post> findPostID(long idPost){return postInterface.findById(idPost);}

    public List<Post> findAllPost(){return postInterface.findAll();}

    public void deletePost(Long idPost){postInterface.deleteById(idPost);}
}
