package com.study.hj.web.controller.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;


/** Test를 위해 Builder 붙임*/
@Getter
@Setter
@Builder
public class TestDTO {
    private String id;
    private String name;
    private String phone;
}
