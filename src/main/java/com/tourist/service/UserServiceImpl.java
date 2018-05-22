package com.tourist.service;

import com.tourist.entity.EnumRole;
import com.tourist.entity.User;
import com.tourist.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getByUsername(String name) {
        return userRepository.findByUsername(name);
    }

    @Override
    public User getById(String id) {
        return userRepository.findById(id);
    }

    @Override
    public void createNewUser(User user) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        User newUser = new User();

        newUser.setUsername(user.getUsername());
        newUser.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        newUser.setRole(EnumRole.USER);

        userRepository.save(newUser);
    }

    @Override
    public void deleteUserById(String id) {
        User user = userRepository.findById(id);
        userRepository.delete(user);
    }

    @Override
    public Boolean checkPassword(String username, String password) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not authorized.");
        }
        String passwordData = bCryptPasswordEncoder.encode(password);

        System.out.println(user.getPassword());
        if (user.getPassword() == passwordData) {
            System.out.println("ok");
            return true;
        } else {
            System.out.println("error");
            return false;
        }
    }


}
