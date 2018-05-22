package com.tourist.repository;

import com.tourist.entity.Tour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public interface TourRepository extends JpaRepository<Tour, String> {

    List<Tour> findAll();
    Tour findById(String id);

}
