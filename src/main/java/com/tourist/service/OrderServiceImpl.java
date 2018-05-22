package com.tourist.service;

import com.tourist.entity.EnumStatusBooking;
import com.tourist.entity.OrderTour;
import com.tourist.repository.OrdertourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Ngoc Quy on 5/2/2018.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    protected OrdertourRepository ordertourRepository;


    @Override
    public List<OrderTour> getAllOrder() {
        return ordertourRepository.findAll();
    }

    @Override
    public OrderTour getOrderById() {
        return null;
    }

    @Override
    public List<OrderTour> getOrderByUser(String id) {
        return ordertourRepository.findOrderByUser_Id(id);
    }

    @Override
    public List<OrderTour> getOrderByUser_IdAndStatusBookingIsNotLike(String userId, String status) {
        return null;
    }

    @Override
    public OrderTour getOrderById(String id) {
        return ordertourRepository.findById(id);
    }

    @Override
    public void checkDoneOrderTour(OrderTour orderTourForm) {
        OrderTour orderTour = ordertourRepository.findById(orderTourForm.getId());
        System.out.println("-------"+orderTour.getStatusBooking()+" : "+orderTour.getId());
        orderTour.setStatusBooking(EnumStatusBooking.DONE);
        ordertourRepository.save(orderTour);
    }

    @Override
    public void checkCancelOrderTour(OrderTour orderTourForm) {
        OrderTour orderTour = ordertourRepository.findById(orderTourForm.getId());
        orderTour.setStatusBooking(EnumStatusBooking.CANCEL);
        ordertourRepository.save(orderTour);
    }

    @Override
    public void createOrderTour(OrderTour orderTour) {
        OrderTour orderTourBooking = new OrderTour();
        orderTourBooking.setStatusBooking(EnumStatusBooking.WAITING);
        orderTourBooking.setNote("Đầy đủ");
        orderTourBooking.setQuantily(orderTour.getQuantily());
        Date today = new Date(System.currentTimeMillis());
        orderTourBooking.setDateBooking(today);
        orderTourBooking.setUser(orderTour.getUser());
        orderTourBooking.setTour(orderTour.getTour());
        ordertourRepository.save(orderTourBooking);
    }

    @Override
    public void deleteOrderTour(String orderTour) {
        try{
            ordertourRepository.delete(orderTour);
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }

//
//    @Override
//    public Double getSumOrderByUser(String status, String id) {
//        Double sum = 1.0;
//        try {
//            Double lists = ordertourRepository.findOrderByTour_Id(status, id);
//            sum = lists;
//        }catch (Exception e) {
//            System.out.println(e.toString());
//        }
//
//        return sum;
//    }

}
