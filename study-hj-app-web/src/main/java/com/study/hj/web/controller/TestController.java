package com.study.hj.web.controller;

import com.study.hj.web.controller.dto.TestDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/v1/study")
@RequiredArgsConstructor
public class TestController {

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> testGet(@PathVariable String id) {
        return ResponseEntity.ok()
                .body(TestDTO.builder()
                        .id(id)
                        .name("success get")
                        .phone("010-0000-0000")
                        .build());
    }

    @PostMapping
    public ResponseEntity<?> testPost(@RequestBody TestDTO testDTO) {
        return ResponseEntity.ok()
                .body(testDTO);
    }
}
