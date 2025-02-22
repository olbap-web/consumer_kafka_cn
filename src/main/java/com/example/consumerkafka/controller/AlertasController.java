package com.example.consumerkafka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.consumerkafka.service.ConsumerService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
// @RequestMapping("/bff")
public class AlertasController {
    
    @Autowired
    ConsumerService service;

    @GetMapping("alertas/")
	public ResponseEntity<List<String>> readsenales() {
		return ResponseEntity.ok(service.getAlertasMessages());
	}

}
