package com.tourist.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tour")
public class Tour implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id = UUID.randomUUID().toString();

    @Column(name = "title")
    private String title;

    @Column(name = "address")
    private String address;

    @Column(name = "content")
    private String content;

    @Column(name = "image")
    private String image;

    @Column(name = "date_start")
    private Date dateStart;

    @Column(name = "date_end")
    private Date dateEnd;

    @Column(name = "cost")
    private int costTour;

    @Column(name = "tour_time")
    private String tourTimes;

    @Column(name = "quantity")
    private int quantity;

    @OneToMany(mappedBy = "tour")
    private List<OrderTour> ordertours;

    public Tour() {

    }

    public Tour(String id) {
        this.setId(id);
    }

    public Tour(String id, String title, String content, String address, String image, Date date_start, Date date_end, String tour_time, int cost, int quantity) {
        this.setId(id);
        this.setTitle(title);
        this.setAddress(address);
        this.setContent(content);
        this.setImage(image);
        this.setDateStart(date_start);
        this.setDateEnd(date_end);
        this.setTourTimes(tour_time);
        this.setCostTour(cost);
        this.setQuantity(quantity);
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public int getCostTour() {
        return costTour;
    }

    public void setCostTour(int costTour) {
        this.costTour = costTour;
    }

    public String getTourTimes() {
        return tourTimes;
    }

    public void setTourTimes(String tourTimes) {
        this.tourTimes = tourTimes;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public List<OrderTour> getOrdertours() {
        return ordertours;
    }

    public void setOrdertours(List<OrderTour> ordertours) {
        this.ordertours = ordertours;
    }
}
