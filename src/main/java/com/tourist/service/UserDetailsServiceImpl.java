package com.tourist.service;

import com.tourist.entity.EnumRole;
import com.tourist.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by Ngoc Quy on 4/5/2018.
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserService userService;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = this.userService.getByUsername(s);
        if (user == null){
            System.out.println("Not found...."+s);
            throw new UsernameNotFoundException("User " + s + " was not found in the database");
        }
        System.out.println("Found User: " + user);

        EnumRole enumRole = user.getRole();

        if (enumRole != null) {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(String.valueOf(enumRole));
        }
        UserDetails userDetails = (UserDetails) new User(user.getUsername(),user.getPassword(),enumRole);
        return userDetails;
    }


}
