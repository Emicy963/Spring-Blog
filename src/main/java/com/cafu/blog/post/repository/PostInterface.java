package com.cafu.blog.post.repository;

import com.cafu.blog.post.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostInterface extends JpaRepository<Post, Long> {
    Optional<Post> findById(String idPost);
}
