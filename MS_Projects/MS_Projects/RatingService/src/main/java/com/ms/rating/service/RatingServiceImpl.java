package com.ms.rating.service;

import com.ms.rating.entities.Rating;
import com.ms.rating.repo.RatingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepo ratingRepo;

    @Override
    public Rating create(Rating rating) {
        return ratingRepo.save(rating);
    }

    @Override
    public Rating getSingleRating(int id) {
        return ratingRepo.findById(id).orElseThrow(() -> new RuntimeException("given id is not found"));
    }

    @Override
    public List<Rating> getAll() {
        return ratingRepo.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(int userId) {
        return ratingRepo.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotelId(int hotelId) {
        return ratingRepo.findByHotelId(hotelId);
    }
}
