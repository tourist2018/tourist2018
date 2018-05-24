package com.tourist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tourist.entity.CommentEntity;

public interface CommentRepository extends JpaRepository<CommentEntity, String>{

    List<CommentEntity> findByTourId(String id);

}
