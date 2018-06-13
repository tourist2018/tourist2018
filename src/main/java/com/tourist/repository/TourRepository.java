package com.tourist.repository;

import com.tourist.entity.Tour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;


@Repository
@Transactional
public interface TourRepository extends JpaRepository<Tour, String> {

    List<Tour> findAll();
    Tour findById(String id);

    @Query("select t from Tour t where t.address like CONCAT('%',:address,'%') and t.dateStart>:date and t.costTour <:cost")
    List<Tour> searchTourAll(@Param("address") String address, @Param("date") Date date, @Param("cost") int cost);

    @Query("select t from Tour t where t.address like CONCAT('%',:address,'%')")
    List<Tour> searchTourByAddress(@Param("address") String address);

    @Query("select t from Tour t where t.dateStart>:date")
    List<Tour> searchTourByDate( @Param("date") Date date);

    @Query("select t from Tour t where t.costTour <:cost")
    List<Tour> searchTourByCost(  @Param("cost") int cost);

    @Query("select t from Tour t where t.address like CONCAT('%',:address,'%') and t.dateStart>:date")
    List<Tour> searchTourByAddressAndDate(  @Param("address") String address, @Param("date") Date date);

    @Query("select t from Tour t where t.address like CONCAT('%',:address,'%') and t.costTour <:cost")
    List<Tour> searchTourByAddressAndCost(  @Param("address") String address, @Param("cost") int cost);

    @Query("select t from Tour t where t.dateStart>:date and t.costTour <:cost")
    List<Tour> searchTourByDateAndCost( @Param("date") Date date,@Param("cost") int cost);

    Tour findByDateStart(Date date);

//    @Query("select t.id from Tour as t")  (select count(*) from OrderTour as o where o.tour.id = t.id) as quantity
    @Query("SELECT DISTINCT t FROM Tour as t join OrderTour as o on t.id = o.tour group by t.id order by count(o.tour) DESC")
    List<Tour> findTourByCustomValue();


}
