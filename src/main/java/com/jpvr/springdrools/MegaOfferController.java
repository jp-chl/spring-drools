package com.jpvr.springdrools;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class MegaOfferController {

    @PostMapping("/order")
    public String orderNow(@RequestBody Order order) {
        
    }
}