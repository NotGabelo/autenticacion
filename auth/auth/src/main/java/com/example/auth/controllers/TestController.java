package com.example.auth.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.security.Principal;
import java.util.*;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/user")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<?> userAccess(Principal principal) {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Contenido de usuario accesible");
        response.put("email", principal.getName());
        return ResponseEntity.ok(response);
    }
}
