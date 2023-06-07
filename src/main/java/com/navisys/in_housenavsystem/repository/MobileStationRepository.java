package com.navisys.in_housenavsystem.repository;

import com.navisys.in_housenavsystem.model.MobileStation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface MobileStationRepository extends JpaRepository<MobileStation, UUID> {

    MobileStation save(MobileStation mobileStation);

    Optional<MobileStation> findById(UUID id);

}
