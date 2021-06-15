package com.codeup.springblog;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    Post findByTitle(String title);
    Post findByTitleLike(String searchPattern);
    Post findFirstByTitle(String title);
}
