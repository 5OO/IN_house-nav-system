package com.navisys.in_housenavsystem.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class MobileStationLocationDto {
    private UUID mobileId;
    private float x;
    private float y;
    private float error_radius;
    private int error_code;
    private String error_description;
}
