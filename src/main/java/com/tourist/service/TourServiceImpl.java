package com.tourist.service;

import com.tourist.entity.Tour;
import com.tourist.repository.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TourServiceImpl implements TourService {

    @Autowired
    private TourRepository tourRepository;

    @Override
    public List<Tour> getAllTour() {
        return tourRepository.findAll();
    }

    @Override
    public Tour getIdTour(String id) {
        return tourRepository.findById(id);
    }
}
