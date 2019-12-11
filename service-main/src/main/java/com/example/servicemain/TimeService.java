package com.example.servicemain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TimeService {

    private final static String URL = "http://localhost:8081/time";
    @Autowired
    RestTemplate restTemplate;

    public String getTime() {
        return restTemplate.getForObject(URL, String.class);
    }

}
