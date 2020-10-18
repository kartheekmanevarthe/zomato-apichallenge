package com.example.serviceImpl;

import com.example.model.Location;
import com.example.service.LocationDetailsService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;

@Service
public class LocationDetailsServiceImpl implements LocationDetailsService {

    RestTemplate restTemplate = new RestTemplate();

    @Value("${zomato.base.url}")  String zomatoEndpoint;

    @Value("${zomato.user.key}")  String userKey;

    @Override
    public Location getLocation(double lat, double lon) {
        final StringBuilder zomatoUrlBuilder = new StringBuilder(zomatoEndpoint);
        zomatoUrlBuilder.append("locations");
        zomatoUrlBuilder.append("?lat=").append(lat);
        zomatoUrlBuilder.append("&lat=").append(lon);
        Location location = doHttpCallToZomato(zomatoUrlBuilder);
        return location;
    }



    private Location doHttpCallToZomato(StringBuilder zomatoUrlBuilder) {

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("user-key", "76bcdf14d39db3a1dfe5e218f192a412");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
        ResponseEntity<Location> respEntity = restTemplate.
                exchange(zomatoUrlBuilder.toString(),
                        HttpMethod.GET, entity, Location.class);
        return respEntity.getBody();

    }


}
