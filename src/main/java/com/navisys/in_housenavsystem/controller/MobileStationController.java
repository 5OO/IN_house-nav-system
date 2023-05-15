package com.navisys.in_housenavsystem.controller;

import com.navisys.in_housenavsystem.dto.MobileStationLocationDto;
import com.navisys.in_housenavsystem.service.MobileStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
public class MobileStationController {
    @Autowired
    private MobileStationService service;

    @GetMapping("/location/{uuid}")
    public ResponseEntity<MobileStationLocationDto> getLocation(@PathVariable UUID uuid) {
        MobileStationLocationDto location = service.getLocation(uuid);
        if (location == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(location);
    }

}
