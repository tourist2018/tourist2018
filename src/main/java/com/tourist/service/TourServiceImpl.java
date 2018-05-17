package com.tourist.service;

import com.tourist.entity.EnumStatusBooking;
import com.tourist.entity.Tour;
import com.tourist.repository.OrdertourRepository;
import com.tourist.repository.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
    public Tour getByDateStart(Date date) {
        return tourRepository.findByDateStart(date);
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

    @Override
    public List<Tour> searchTourAll(String address, Date date, int cost) {
        return tourRepository.searchTourAll( address, date, cost);
    }

    @Override
    public List<Tour> searchTourByAddress(String address) {
        return tourRepository.searchTourByAddress(address);
    }

    @Override
    public List<Tour> searchTourByDate(Date date) {

        return tourRepository.searchTourByDate(date);
    }

    @Override
    public List<Tour> searchTourByCost(int cost) {
        return tourRepository.searchTourByCost(cost);
    }

    @Override
    public List<Tour> searchTourByAddressAndDate(String address, Date date) {
        return tourRepository.searchTourByAddressAndDate(address, date);
    }

    @Override
    public List<Tour> searchTourByAddressAndCost(String address, int cost) {
        return tourRepository.searchTourByAddressAndCost(address,cost);
    }

    @Override
    public List<Tour> searchTourByDateAndCost(Date date, int cost) {
        return tourRepository.searchTourByDateAndCost(date, cost);
    }
}
