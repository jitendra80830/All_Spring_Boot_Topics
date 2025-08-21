package com.ms.hotel.service;

import com.ms.hotel.entities.Hotel;
import com.ms.hotel.exception.ResourceNotFoundException;
import com.ms.hotel.repo.HotelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    private HotelRepo hotelRepo;

    @Override
    public Hotel create(Hotel hotel) {
        return hotelRepo.save(hotel);
    }

    @Override
    public Hotel get(int id) {
        return hotelRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel with given id is not found"));
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepo.findAll();
    }
}
