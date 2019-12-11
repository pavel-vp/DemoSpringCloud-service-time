package com.example.servicemain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    NameService nameService;
    @Autowired
    TimeService timeService;

    @RequestMapping
    public String getAll() {
        return nameService.getName() + "===" + timeService.getTime();
    }
}
