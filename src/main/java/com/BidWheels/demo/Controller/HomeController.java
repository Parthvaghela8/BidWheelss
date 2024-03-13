package com.BidWheels.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {

    @GetMapping("/")
    public String Home(){
        return "<h2>Welcome To Bid Wheels</h2>";
    }
}
