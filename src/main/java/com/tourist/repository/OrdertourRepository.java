package com.tourist.repository;

import com.tourist.entity.EnumStatusBooking;
import com.tourist.entity.OrderTour;
import com.tourist.entity.Tour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Ngoc Quy on 5/7/2018.
 */
@Repository
@Transactional
public interface OrdertourRepository extends JpaRepository<OrderTour, String>{
    /*@Query("select c from tourorder c where c.user_id = :userId")
    List<OrderTour> findAllByUser(String userId);*/
    OrderTour findById(String id);

    List<OrderTour> findOrderByUser_Id(String userId);
//    List<OrderTour> findOrderByUser_IdAndStatusBookingIsNotLike(String userId, String status);

    @Query(value = "SELECT u FROM OrderTour u WHERE u.tour =:tour AND u.statusBooking = :status")
    List<OrderTour> findOrderTourByTour_Id(@Param("status") EnumStatusBooking status, @Param("tour") Tour tourId);


    @Query(value = "SELECT count(*) FROM OrderTour u WHERE u.tour =:tour AND u.statusBooking = :status")
    Double findByTour_Id(@Param("status") EnumStatusBooking status, @Param("tour") Tour tourId);

    @Query("SELECT count(*) FROM OrderTour u WHERE u.statusBooking = :status")
    Double findOrderByTour_IdTest(@Param("status") EnumStatusBooking status);

    @Query("delete from OrderTour u where u.id = ?1")
    void deleteOrderById(String userId);
}
