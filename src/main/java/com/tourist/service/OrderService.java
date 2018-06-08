package com.tourist.service;

import com.tourist.entity.EnumStatusBooking;
import com.tourist.entity.OrderTour;

import java.util.List;


public interface OrderService {
    List<OrderTour> getAllOrder();
    OrderTour getOrderById();
    List<OrderTour> getOrderByUser(String userId);
    List<OrderTour> getOrderByUser_IdAndStatusBookingIsNotLike(String userId, String status);
    OrderTour getOrderById(String id);
    void checkDoneOrderTour(OrderTour orderTour);
    void checkCancelOrderTour(OrderTour orderTour);

    void createOrderTour(OrderTour orderTour);
    void deleteOrderTour(String orderTour);
//    Double getSumOrderByUser(String status, String id);

}
