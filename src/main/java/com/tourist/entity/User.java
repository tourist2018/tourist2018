package com.tourist.entity;


import org.hibernate.annotations.Cascade;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import javax.persistence.*;


@Entity
@Table(name = "user")
//@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id = UUID.randomUUID().toString();

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private EnumRole role;

    @OneToMany(mappedBy = "user")
    private List<OrderTour> ordertours;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id", nullable = false)
    private Profile profile;

    public User() {
        super();
    }

    public User(String name, String password) {
        this.setUsername(name);
        this.setPassword(password);
    }

    public User(String name, String password,EnumRole role) {
        this.setUsername(name);
        this.setPassword(password);
        this.setRole(role);
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
        return "Name: " + this.getUsername();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (!id.equals(user.id)) return false;
        if (!username.equals(user.username)) return false;
        if (!password.equals(user.password)) return false;
        return role == user.role;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + username.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + role.hashCode();
        return result;
    }

    public List<OrderTour> getOrdertours() {
        return ordertours;
    }

    public void setOrdertours(List<OrderTour> ordertours) {
        this.ordertours = ordertours;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
