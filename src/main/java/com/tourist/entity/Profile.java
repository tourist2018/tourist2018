package com.tourist.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "customer")
public class Profile implements Serializable {

    private static final long serialVersionUID = 3738431674663189549L;
    @Id
    private String id = UUID.randomUUID().toString();

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "sex")
    @Enumerated(EnumType.STRING)
    private EnumSex sex;

    @Column(name = "avatar")
    private String avatar;

    @OneToOne(mappedBy = "profile", fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
    private User userId;



    public Profile() {

    }

    public Profile(String id, String first, String lastName, String email, EnumSex gander, String avatar, User userId) {
        this.setId(id);
        this.setFirstName(first);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setSex(gander);
        this.setAvatar(avatar);
        this.setUserId(userId);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EnumSex getSex() {
        return sex;
    }

    public void setSex(EnumSex sex) {
        this.sex = sex;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }
}
