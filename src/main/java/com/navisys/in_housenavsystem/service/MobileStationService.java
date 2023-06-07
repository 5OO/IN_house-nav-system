package com.navisys.in_housenavsystem.service;


import com.navisys.in_housenavsystem.dto.MobileStationLocationDto;
import com.navisys.in_housenavsystem.model.MobileStation;
import com.navisys.in_housenavsystem.repository.BaseStationRepository;
import com.navisys.in_housenavsystem.repository.MobileStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;
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
        Optional<MobileStation> mobileStationOptional = mobileStationRepository.findById(uuid);

        if (!mobileStationOptional.isPresent()) {
            throw new NoSuchElementException("No MobileStation with id: " + uuid);
        }

        MobileStation mobileStation = mobileStationOptional.get();

        MobileStationLocationDto dto = new MobileStationLocationDto();
        dto.setMobileId(mobileStation.getId());
        dto.setX(mobileStation.getLastKnownX());
        dto.setY(mobileStation.getLastKnownY());

        // TODO: Calculate error_radius, error_code, error_description

        return dto;
    }
}
