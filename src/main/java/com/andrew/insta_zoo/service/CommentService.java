package com.andrew.insta_zoo.service;

import com.andrew.insta_zoo.dto.CommentDTO;
import com.andrew.insta_zoo.model.Comment;

import java.security.Principal;
import java.util.List;

public interface CommentService {

    Comment saveComment(Long postId, CommentDTO commentDTO, Principal principal);

    List<Comment> getAllCommentsForPost(Long postId);

    void deleteComment(Long commentId);
}
