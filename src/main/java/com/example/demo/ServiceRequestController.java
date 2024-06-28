package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceRequestController {

    @GetMapping
    public ServiceRequest getServiceRequest() {
        return new ServiceRequest("Louis", "M.", "louis101@example.com", "Diggah brauche nen Springboot service. Mach schnell!");
    }

}
