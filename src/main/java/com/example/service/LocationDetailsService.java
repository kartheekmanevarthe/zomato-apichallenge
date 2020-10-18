package com.example.service;

import com.example.model.Location;

public interface LocationDetailsService {

    Location getLocation(double lat, double lon);

}
