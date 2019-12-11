package com.example.servicename;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {


    @RequestMapping("/name")
    public String getName() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<6; i++) {
            sb.append(Character.toString((char)(41+ Math.random() * 27)));
        }
        return sb.toString();
    }

}
