package com.ms.rating.repo;

import com.ms.rating.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepo extends JpaRepository<Rating , Integer> {

    List<Rating> findByUserId(int userId);

    List<Rating> findByHotelId(int hotelId);
}
