package com.navisys.in_housenavsystem.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class BaseStationReportDto {
    private UUID base_station_id;
    private List<ReportDto> reports;
}
