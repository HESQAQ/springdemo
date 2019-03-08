package com.wangsu.servicefeign.web;

import com.wangsu.servicefeign.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    HiService hiService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name ) {
        return hiService.sayHiFromClientOne(name);
    }
}
