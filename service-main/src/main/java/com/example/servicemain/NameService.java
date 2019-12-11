package com.example.servicemain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NameService {

    private final static String URL = "http://localhost:8082/name";
    @Autowired
    RestTemplate restTemplate;

    public String getName() {
        return restTemplate.getForObject(URL, String.class);
    }



}
