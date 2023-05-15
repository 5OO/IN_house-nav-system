package com.navisys.in_housenavsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
@Entity
public class MobileStation {
    @Id
    private UUID id;
    private String name;
    private Float lastKnownX;
    private Float lastKnownY;
}
