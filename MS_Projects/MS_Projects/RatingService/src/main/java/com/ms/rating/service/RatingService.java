package com.ms.rating.service;

import com.ms.rating.entities.Rating;

import java.util.List;

public interface RatingService {

    Rating create(Rating rating);

    Rating getSingleRating(int id);

    List<Rating> getAll();

    List<Rating> getRatingByUserId(int userId);

    List<Rating> getRatingByHotelId(int hotelId);
}
