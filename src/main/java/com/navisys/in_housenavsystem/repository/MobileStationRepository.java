package com.navisys.in_housenavsystem.repository;

import com.navisys.in_housenavsystem.model.MobileStation;

import java.util.UUID;

public interface MobileStationRepository extends JPARepository<MobileStation, UUID> {

    MobileStation save(MobileStation mobileStation);
}
