package com.codegym.blog.repositories;

import com.codegym.blog.models.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
    List<Post> findAllByIsDeleteIsFalse();

    Post findAllByIdAndIsDeleteIsFalse(Long id);

    Page<Post> findAllByTitleContainingAndIsDeleteIsFalse(Pageable pageable, String s);

    Page<Post> findAllByTitleAndCategoryContaining(Pageable pageable, String s, Long id);
}
