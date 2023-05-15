package com.navisys.in_housenavsystem.controller;

import com.navisys.in_housenavsystem.dto.BaseStationReportDto;
import com.navisys.in_housenavsystem.service.BaseStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseStationController {

    @Autowired
    private BaseStationService service;

    @PostMapping("/report")
    public ResponseEntity<?> report(@RequestBody BaseStationReportDto report) {
        service.processReport(report);
        return ResponseEntity.ok().build();
    }
}
