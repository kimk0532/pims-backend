package com.skcc.pims.pms;

import com.skcc.pims.core.entity.Project;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PimsPmsApplication {

    public static void main(String[] args) {

        Project project = new Project();

        project.setProjectNo("test");
        project.setSubProjectNo("test");

        System.out.println("project.getProjectNo() = " + project.getProjectNo());

        SpringApplication.run(PimsPmsApplication.class, args);
    }

}
