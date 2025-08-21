package com.ms.hotel.service;

import com.ms.hotel.entities.Hotel;

import java.util.List;

public interface HotelService {

    Hotel create(Hotel hotel);

    Hotel get(int id);

    List<Hotel> getAll();
}
