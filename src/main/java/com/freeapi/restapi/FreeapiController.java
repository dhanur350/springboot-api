package com.freeapi.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class FreeapiController {
//    private readonly str;
    @Autowired
    @GetMapping("/fetch")

    private String hello() {
        return "Hello";
    }

    private ResponseEntity<String> GetDataAPI() {
        return ResponseEntity.ok("Hello");
    }
}
