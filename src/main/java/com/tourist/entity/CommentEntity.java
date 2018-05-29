package com.tourist.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="comment")
public class CommentEntity implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private String id = UUID.randomUUID().toString();
    @Column(name = "user_id")
    private String userId;
    @Column(name = "tour_id")
    private String tourId;
    @Column(name = "content")
    private String content;


    @ManyToOne
    @JoinColumn(name = "tour_id",nullable=false,insertable= false,updatable=false)
    private Tour tour;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable=false,insertable= false,updatable=false)
    private User user;

    public CommentEntity(String userId, String tourId, String content) {
        super();
        this.userId = userId;
        this.tourId = tourId;
        this.content = content;
    }

    public CommentEntity() {
        super();
    }

    public CommentEntity(String id, String userId, String tourId, String content) {
        super();
        this.id = id;
        this.userId = userId;
        this.tourId = tourId;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTourId() {
        return tourId;
    }

    public void setTourId(String tourId) {
        this.tourId = tourId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }




}
