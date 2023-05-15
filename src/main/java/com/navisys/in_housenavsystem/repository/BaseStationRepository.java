package com.navisys.in_housenavsystem.repository;

import com.navisys.in_housenavsystem.model.BaseStation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface BaseStationRepository extends JpaRepository<BaseStation, UUID> {

    Optional<BaseStation> findById(UUID id);

    BaseStation save(BaseStation baseStation);
}
