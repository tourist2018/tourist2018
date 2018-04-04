package com.tourist.entity;



import java.io.Serializable;
import java.util.UUID;

import javax.persistence.*;


@Entity
@Table(name = "user")
//@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	private String id = UUID.randomUUID().toString();
	
	@Column(name = "username")
	private String username;
	
	@Column(name="password")
	private String password;

	@Column(name="role")
	@Enumerated(EnumType.STRING)
	private EnumRole role;

	public User() {
		
	}
	public User(String name, String password) {
	    this.setUsername(name);
	    this.setPassword(password);
	  }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    public EnumRole getRole() {
        return role;
    }

    public void setRole(EnumRole role) {
        this.role = role;
    }

    @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+this.getUsername();
	}



}
