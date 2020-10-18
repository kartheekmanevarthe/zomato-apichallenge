package com.example.controller;

import com.example.model.Location;
import com.example.service.LocationDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = {"zomato"})
public class LocationDetailsController {

    private final LocationDetailsService locationDetailsService;

    public LocationDetailsController(LocationDetailsService locationDetailsService) {
        this.locationDetailsService = locationDetailsService;
    }

    @GetMapping("/location")
    @ResponseBody
    public Location getLocation(@RequestParam("lat") double lat,
                                @RequestParam("lon") double lon ){
        Location location = locationDetailsService.getLocation(lat,lon);
        System.out.println(" *************** successfully returned Location ***************  ");
        return location;
    }

}
