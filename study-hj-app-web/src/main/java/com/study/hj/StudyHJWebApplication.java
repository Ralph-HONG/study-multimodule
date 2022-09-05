package com.study.hj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class StudyHJWebApplication {

    public static final String TIME_ZONE = "Asia/Seoul";

    @PostConstruct
    void started() {
        TimeZone.setDefault(TimeZone.getTimeZone(TIME_ZONE));
    }

    public static void main(String[] args) {
        SpringApplication.run(StudyHJWebApplication.class);
    }
}
