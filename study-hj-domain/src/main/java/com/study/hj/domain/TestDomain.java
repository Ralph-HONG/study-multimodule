package com.study.hj.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TestDomain {
    private String id;
    private String name;
    private String phone;
}
