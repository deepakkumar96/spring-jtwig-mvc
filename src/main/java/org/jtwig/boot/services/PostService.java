package org.jtwig.boot.services;

import org.jtwig.boot.models.Post;

import java.util.List;
import org.springframework.stereotype.Service;


public interface PostService {
    List<Post> findAll();
    List<Post> findLatest5();
    Post findById(Long id);
    Post create(Post post);
    Post edit(Post post);
    void deleteById(Long id);
}
