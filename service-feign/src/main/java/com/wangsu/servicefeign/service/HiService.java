package com.wangsu.servicefeign.service;

import com.wangsu.servicefeign.service.fallback.hiServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="service-hi" ,fallback = hiServiceHystrix.class)
public interface HiService {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name")String name);

}
