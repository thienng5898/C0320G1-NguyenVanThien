package com.codegym.blog.services;

import com.codegym.blog.models.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PostService {
    List<Post> getAllPost();

    void savePost(Post post);

    Post getPostById(Long id);

    void updatePost(Post post);

    void deletePost(Post post);

    Page<Post> getAllPostByTitle(Pageable pageable, String s);
}
