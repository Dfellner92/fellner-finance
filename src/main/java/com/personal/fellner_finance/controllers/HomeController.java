package com.personal.fellner_finance.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "Welcome to Fellner Finance API! This endpoint is public.";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        return "Welcome to your dashboard, " + username + "! This endpoint requires authentication.";
    }

    @GetMapping("/admin")
    public String admin() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        boolean isAdmin = authentication.getAuthorities().stream()
                .anyMatch(a -> a.getAuthority().equals("ROLE_ADMIN"));
        
        if (isAdmin) {
            return "Welcome to admin panel, " + username + "! You have admin privileges.";
        } else {
            return "Access denied. Admin privileges required.";
        }
    }
}
