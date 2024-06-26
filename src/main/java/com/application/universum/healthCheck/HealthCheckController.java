package com.application.universum.healthCheck;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    @GetMapping("/rest") // Health Check
    public String healthCheck() {
        return "Universum Backend is Up!";
    }

    @GetMapping("/") // Health Check
    public String healthCheckLocal() {
        return "Universum Backend is Up Local!";
    }

    @GetMapping("/rest3") // Health Check
    public String healthCheck2() {
        return "Universum Backend is Up Local!";
    }

}
