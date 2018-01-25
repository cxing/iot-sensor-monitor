package com.cxing.iot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cxing on 2018/1/26.
 */

@RestController
@SpringBootApplication
public class IotSensorMonitorWebApplication {

    @RequestMapping("/")
    public String index(){
        return "Hello Spring Boot";
    }
    public static void main(String[] args) {
        SpringApplication.run(IotSensorMonitorWebApplication.class, args);
    }
}
