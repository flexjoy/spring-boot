package com.example.sprinboottest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@Slf4j
@RestController
public class TestController {

    @GetMapping
    public String greet() {
        log.info("Hit {}", Instant.now());
        return "Hello-from-Openshift";
    }
}
