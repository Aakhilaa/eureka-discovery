package com.gbs.discovery.discoveryclient1.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Client1Controller {

    
    String name="Akhila";

    @GetMapping(value={"", "/"})
    public ResponseEntity<Map<String, String>> index() {
        Map<String, String> body = Map.of("Name", name);
        return ResponseEntity.ok(body);
    }
    
}
