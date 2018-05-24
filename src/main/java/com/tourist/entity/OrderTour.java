package com.tourist.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "tourorder")
public class OrderTour implements Serializable {

    private static final long serialVersionUID = -8642601765942623915L;

    @Id
    @Column(name = "order_id")
    private String id = UUID.randomUUID().toString();
    @Column(name = "date_booking")
    private Date dateBooking;
    @Column(name = "note")
    private String note;

    @Column(name = "quantily")
    private int quantily;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private EnumStatusBooking statusBooking;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "tour_id")
    private Tour tour;

    public OrderTour(){
        super();
    }
    public OrderTour(String id, Date date, String note, EnumStatusBooking status, User user, Tour tour){
        this.setId(id);// ko can set vi String id = UUID.randomUUID().toString(); , khi tao object se tu sinh ra uuid
        this.setDateBooking(date);
        this.setNote(note);
        this.setStatusBooking(status);
        this.user = user;
        this.setTour(tour);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(Date dateBooking) {
        this.dateBooking = dateBooking;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public EnumStatusBooking getStatusBooking() {
        return statusBooking;
    }

    public void setStatusBooking(EnumStatusBooking statusBooking) {
        this.statusBooking = statusBooking;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }


    public int getQuantily() {
        return quantily;
    }

    public void setQuantily(int quantily) {
        this.quantily = quantily;
    }
}
