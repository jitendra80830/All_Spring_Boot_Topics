package com.ms.hotel.repo;

import com.ms.hotel.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepo extends JpaRepository<Hotel , Integer> {
}
