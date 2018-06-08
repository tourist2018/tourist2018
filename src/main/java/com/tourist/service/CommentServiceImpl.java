package com.tourist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tourist.entity.CommentEntity;
import com.tourist.repository.CommentRepository;
@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    CommentRepository commentRepository;

    @Override
    public CommentEntity saveComment(CommentEntity commentEntity) {
        // TODO Auto-generated method stub
        return commentRepository.save(commentEntity);
    }

    @Override
    public List<CommentEntity> getAllCommentByIdPost(String id) {
        // TODO Auto-generated method stub
        return commentRepository.findByTourId(id);
    }


}
