package com.tourist.service;

import com.tourist.entity.OrderTour;
import com.tourist.repository.OrdertourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public OrderTour getOrderById(String id) {
        return ordertourRepository.findById(id);
    }


    @Override
    public int getSumOrderByUser(String id) {
        int sum = 0;
        try {
            List<OrderTour> lists = ordertourRepository.findAll();
            sum = lists.size();
        }catch (Exception e) {
            System.out.println(e.toString());
        }
//        sum = orderRepository.sumIdByUser("2ef674ac-f522-40ed-88f7-b2b44424b43d");

        return sum;
    }

    @Override
    public int getSumOrderEmpty() {
        return 0;
    }
}
