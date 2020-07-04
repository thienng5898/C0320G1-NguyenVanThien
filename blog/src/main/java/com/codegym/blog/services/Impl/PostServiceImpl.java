package com.codegym.blog.services.Impl;

import com.codegym.blog.models.Post;
import com.codegym.blog.repositories.PostRepository;
import com.codegym.blog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> getAllPost() {
        return postRepository.findAllByIsDeleteIsFalse();
    }

    @Override
    public void savePost(Post post) {
        post.setDelete(false);
        postRepository.save(post);
    }

    @Override
    public Post getPostById(Long id) {
        return postRepository.findAllByIdAndIsDeleteIsFalse(id);
    }

    @Override
    public void updatePost(Post post) {
        post.setDelete(false);
        postRepository.save(post);
    }

    @Override
    public void deletePost(Post post) {
//        Post p = postRepository.findById(post.getId()).orElse(null);
//        if (p !=null) {
//            p.setDelete(true);
//            postRepository.save(p);
//        }

    }

    @Override
    public Page<Post> getAllPostByTitle(Pageable pageable, String s) {
        pageable= PageRequest.of(pageable.getPageNumber(),3, Sort.by("title"));
        return postRepository.findAllByTitleContainingAndIsDeleteIsFalse(pageable,s) ;
    }
}
