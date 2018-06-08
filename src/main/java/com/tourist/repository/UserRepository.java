package com.tourist.repository;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tourist.entity.User;


@Repository
@Transactional
public interface UserRepository  extends JpaRepository<User, String> {

	User findByUsername(String username);
	User findByPassword(String password);
	User findById(String id);

	User findByIdAndProfile(String id, String profile);

	@Query("delete User where id = :id")
    @Modifying
	void deleteUserById(@Param("id") String id);
	
}
