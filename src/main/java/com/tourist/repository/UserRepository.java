package com.tourist.repository;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tourist.entity.User;


@Repository
@Transactional
public interface UserRepository  extends JpaRepository<User, String> {

	User findByUsername(String username);
	User findByPassword(String password);
	User findById(String id);
	void deleteUserById(String id);
	
}
