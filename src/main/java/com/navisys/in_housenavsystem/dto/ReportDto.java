package com.navisys.in_housenavsystem.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
public class ReportDto {
    private UUID mobile_station_id;
    private float distance;
    private Timestamp timestamp;
}
