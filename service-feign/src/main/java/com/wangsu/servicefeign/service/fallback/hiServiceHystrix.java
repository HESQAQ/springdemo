package com.wangsu.servicefeign.service.fallback;
import com.wangsu.servicefeign.service.HiService;
import org.springframework.stereotype.Component;

@Component
public class hiServiceHystrix implements HiService{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
