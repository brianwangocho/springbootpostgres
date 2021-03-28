package com.example.remotekitchen.remotekitchen.controller;

import com.example.remotekitchen.remotekitchen.models.Kitchen.Kitchen;
import com.example.remotekitchen.remotekitchen.repository.KitchenRepository.KitchenRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/kitchen")
public class KitchenController {

    Logger logger = LoggerFactory.getLogger(KitchenController.class);
    @Autowired
    KitchenRepository kitchenRepository;


    @PostMapping("/add_kitchen")
    public ResponseEntity<?>AddKitchen(){

        return null;

    }
    @GetMapping("/nearbykitchens")
    public List<Kitchen>NearByKitchens(@RequestParam("userlocation") List<Double> userLocation){
        //this extraction can also be implemented in return method
        double userLongitude = userLocation.get(0);
        double userLatitude = userLocation.get(1);

        return  kitchenRepository.findNearbyKitchensByDistanceFromUser(userLatitude,userLongitude);
    }
}
