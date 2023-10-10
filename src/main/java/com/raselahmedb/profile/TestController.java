package com.raselahmedb.profile;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public ResponseEntity<?> getHello()
    {
        return ResponseEntity.ok("Hello Rasel Ahmed!");
    }
}
