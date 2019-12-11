package com.example.servicetime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@RestController
public class TimeController {


    @RequestMapping("/time")
    public String getTime() {
        return Calendar.getInstance().getTime().toString();
    }

}
