package com.skcc.pims.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.skcc.pims.core.entity")
@ComponentScan(basePackages = "com.skcc.pims")
public class PimsCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(PimsCommonApplication.class, args);
    }

}
