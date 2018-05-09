package com.tourist.service;

import com.tourist.entity.OrderTour;

import java.util.List;


public interface OrderService {
    List<OrderTour> getAllOrder();
    OrderTour getOrderById();
    List<OrderTour> getOrderByUser(String userId);
    OrderTour getOrderById(String id);
    int getSumOrderByUser(String id);
    int getSumOrderEmpty();

}
