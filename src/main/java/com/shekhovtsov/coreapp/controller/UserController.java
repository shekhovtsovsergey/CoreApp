package com.shekhovtsov.coreapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class UserController {


    @GetMapping("/api/v1/users")
    public ResponseEntity<Map<String, String>> getHeaders(@RequestHeader Map<String, String> headers) {
        return ResponseEntity.ok(headers);
    }

}