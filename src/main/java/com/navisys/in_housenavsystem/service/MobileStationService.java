package com.navisys.in_housenavsystem.service;


import com.navisys.in_housenavsystem.dto.MobileStationLocationDto;
import com.navisys.in_housenavsystem.model.MobileStation;
import com.navisys.in_housenavsystem.repository.BaseStationRepository;
import com.navisys.in_housenavsystem.repository.MobileStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MobileStationService {
    private final MobileStationRepository mobileStationRepository;
    private final BaseStationRepository baseStationRepository;

    @Autowired
    public MobileStationService(MobileStationRepository mobileStationRepository, BaseStationRepository baseStationRepository) {
        this.mobileStationRepository = mobileStationRepository;
        this.baseStationRepository = baseStationRepository;
    }

    public MobileStation save(MobileStation mobileStation) {
        return mobileStationRepository.save(mobileStation);
    }

    public MobileStationLocationDto getLocation(UUID uuid) {
        return null;
    }
}
