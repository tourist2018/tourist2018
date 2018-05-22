package com.tourist.service;

import com.tourist.entity.EnumStatusBooking;
import com.tourist.entity.Tour;
import com.tourist.repository.OrdertourRepository;
import com.tourist.repository.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TourServiceImpl implements TourService {

    @Autowired
    private TourRepository tourRepository;

    @Autowired
    private OrdertourRepository ordertourRepository;

    @Override
    public List<Tour> getAllTour() {
        return tourRepository.findAll();
    }

    @Override
    public Tour getIdTour(String id) {
        return tourRepository.findById(id);
    }

    @Override
    public void newATour(Tour newTour) {
        Tour tour = new Tour();
        tourRepository.save(tour);
    }
    @Override
    public int getQuantityTour(EnumStatusBooking status, Tour tourId) {
        int quantityTour = tourId.getQuantity();

        Double getATour = ordertourRepository.findByTour_Id(status, tourId);
        int getSumATour = getATour.intValue();
        if (getATour == 0){
            return quantityTour;
        }
        else if (getSumATour >= quantityTour){
            return  0;
        }
        else {
            return quantityTour - getSumATour;
        }
    }
}
