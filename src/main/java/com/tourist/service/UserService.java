package com.tourist.service;

import java.util.List;

import com.tourist.entity.User;
import org.springframework.context.annotation.ComponentScan;


public interface UserService {

	List<User> getAllUser();
	User getByUsername(String name);
	void  createNewUser(User user);
	Boolean checkPassword(String username, String password);

	
}
