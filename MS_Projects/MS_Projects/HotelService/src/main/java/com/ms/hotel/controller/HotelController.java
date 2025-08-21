package com.ms.hotel.controller;

import com.ms.hotel.entities.Hotel;
import com.ms.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping
    public ResponseEntity<Hotel> create(@RequestBody Hotel hotel) {
        return new ResponseEntity<>(hotelService.create(hotel), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getAll() {
        return new ResponseEntity<>(hotelService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hotel> getSingleHotel(@PathVariable int id) {
        return new ResponseEntity<>(hotelService.get(id), HttpStatus.OK);
    }


}
