package com.ms.rating.controller;

import com.ms.rating.entities.Rating;
import com.ms.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping
    public ResponseEntity<Rating> create(@RequestBody Rating rating) {
        return new ResponseEntity<>(ratingService.create(rating), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rating> getSingleRating(@PathVariable int id){
        return new ResponseEntity<>(ratingService.getSingleRating(id) , HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Rating>> getAll(){
        return new ResponseEntity<>(ratingService.getAll() , HttpStatus.OK);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable int userId){
        return new ResponseEntity<>(ratingService.getRatingByUserId(userId) , HttpStatus.OK);
    }

    @GetMapping("/hotel/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable int hotelId){
        return new ResponseEntity<>(ratingService.getRatingByHotelId(hotelId) , HttpStatus.OK);
    }


}
