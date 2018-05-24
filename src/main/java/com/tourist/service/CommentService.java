package com.tourist.service;

import java.util.List;

import com.tourist.entity.CommentEntity;

public interface CommentService {
    CommentEntity  saveComment(CommentEntity commentEntity);
    List<CommentEntity> getAllCommentByIdPost(String id);

}
