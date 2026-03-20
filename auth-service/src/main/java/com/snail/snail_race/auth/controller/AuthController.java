package com.snail.snail_race.auth.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/health")
    public ResponseEntity<Map<String, String>> health() {
        return ResponseEntity.ok(Map.of("service", "auth-service", "status", "UP"));
    }

    @PostMapping("/login")
    public ResponseEntity<Map<String, Object>> login(@RequestBody(required = false) Map<String, Object> request) {
        return ResponseEntity.ok(Map.of(
            "service", "auth-service",
            "message", "Login endpoint is ready for JWT implementation.",
            "request", request == null ? Map.of() : request
        ));
    }

    @PostMapping("/signup")
    public ResponseEntity<Map<String, Object>> signup(@RequestBody(required = false) Map<String, Object> request) {
        return ResponseEntity.ok(Map.of(
            "service", "auth-service",
            "message", "Signup endpoint is ready for user registration flow.",
            "request", request == null ? Map.of() : request
        ));
    }
}
