package com.navisys.in_housenavsystem.service;

import com.navisys.in_housenavsystem.dto.BaseStationReportDto;
import com.navisys.in_housenavsystem.model.BaseStation;
import com.navisys.in_housenavsystem.repository.BaseStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class BaseStationService {

    private final BaseStationRepository baseStationRepository;

    @Autowired
    public BaseStationService(BaseStationRepository baseStationRepository) {
        this.baseStationRepository = baseStationRepository;
    }

    public BaseStation save(BaseStation baseStation) {
        return baseStationRepository.save(baseStation);
    }

    public Optional<BaseStation> findById(UUID id) {
        return baseStationRepository.findById(id);
    }

    public void processReport(BaseStationReportDto reportDto) {
        // logic to process the base station report
        //  find base station, updatw   state, save   mobile station reports, etc.
    }
}
