package com.tourist.service;

import com.tourist.entity.EnumStatusBooking;
import com.tourist.entity.Tour;

import java.util.Date;
import java.util.List;

public interface TourService {
    List<Tour> getAllTour();
    Tour getIdTour(String id);
    void newATour(Tour newTour);
    void deleteATour(String idTour);
    Tour getByDateStart(Date date);

    int getQuantityTour(EnumStatusBooking quantity, Tour tourId);

    List<Tour> searchTourAll(String address, Date date, int cost);

    List<Tour> searchTourByAddress(String address);

    List<Tour> searchTourByDate( Date date);

    List<Tour> searchTourByCost(  int cost);

    List<Tour> searchTourByAddressAndDate(  String address,  Date date);

    List<Tour> searchTourByAddressAndCost(   String address,  int cost);

    List<Tour> searchTourByDateAndCost(  Date date, int cost);
}
