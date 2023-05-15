package com.navisys.in_housenavsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


import java.util.UUID;


@Entity
@Getter
@Setter
public class BaseStation {
    @Id
    private UUID id;
    private String name;
    private Float x;
    private Float y;
    private Float detectionRadiusInMeters;

}
