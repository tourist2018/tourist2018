package com.tourist.service;

import java.util.List;

import com.tourist.entity.Profile;
import com.tourist.entity.User;
import org.springframework.context.annotation.ComponentScan;


public interface UserService {

	List<User> getAllUser();
	User getByUsername(String name);
	User getById(String id);
	void  createNewUser(User user);
	void deleteUserById(String id);
	Boolean checkPassword(String username, String password);


	
}
