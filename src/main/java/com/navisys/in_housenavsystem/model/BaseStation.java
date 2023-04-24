package com.navisys.in_housenavsystem.model;

import lombok.Data;

import java.util.UUID;

@Data
public class BaseStation {
    private UUID id;
    private String name;
    private Float x;
    private Float y;
    private Float detectionRadiusInMeters;
}
