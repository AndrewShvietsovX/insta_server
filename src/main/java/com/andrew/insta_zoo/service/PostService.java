package com.andrew.insta_zoo.service;

import com.andrew.insta_zoo.dto.PostDTO;
import com.andrew.insta_zoo.model.Post;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.List;

@Service
public interface PostService {

    Post createPost(PostDTO postDTO, Principal principal);

    List<Post> getAllPosts();

    Post getPostById(Long postId, Principal principal);

    List<Post> getAllPostForUser(Principal principal);

    Post likePost(Long postId, String username);

    void deletePost(Long postId, Principal principal);
}
