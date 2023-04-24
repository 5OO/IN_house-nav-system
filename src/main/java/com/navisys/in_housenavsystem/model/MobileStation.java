package com.navisys.in_housenavsystem.model;

import lombok.Data;

import java.util.UUID;

@Data
public class MobileStation {
    private UUID id;
    private String name;
    private Float lastKnownX;
    private Float lastKnownY;
}
