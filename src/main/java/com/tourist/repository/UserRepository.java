package com.tourist.repository;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tourist.entity.User;


@Repository
@Transactional
public interface UserRepository  extends JpaRepository<User, String> {
	
	List<User> findAll();
	
	
}
