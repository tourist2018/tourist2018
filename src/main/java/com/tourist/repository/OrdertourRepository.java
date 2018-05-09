package com.tourist.repository;

import com.tourist.entity.OrderTour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ngoc Quy on 5/7/2018.
 */
@Repository
public interface OrdertourRepository extends JpaRepository<OrderTour, String>{
    /*@Query("select c from tourorder c where c.user_id = :userId")
    List<OrderTour> findAllByUser(String userId);*/
    OrderTour findById(String id);
    List<OrderTour> findOrderByUser_Id(String userId);
}
