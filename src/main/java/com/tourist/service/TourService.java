package com.tourist.service;

import com.tourist.entity.EnumStatusBooking;
import com.tourist.entity.Tour;

import java.util.List;

public interface TourService {
    List<Tour> getAllTour();
    Tour getIdTour(String id);
    void newATour(Tour newTour);
    int getQuantityTour(EnumStatusBooking quantity, Tour tourId);
}
