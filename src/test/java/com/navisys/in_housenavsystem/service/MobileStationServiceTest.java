package com.navisys.in_housenavsystem.service;

import com.navisys.in_housenavsystem.dto.MobileStationLocationDto;
import com.navisys.in_housenavsystem.model.MobileStation;
import com.navisys.in_housenavsystem.repository.MobileStationRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MobileStationServiceTest {

    @Mock
    private MobileStationRepository repository;

    @InjectMocks
    private MobileStationService service;

    @Test
    public void testGetLocation() {
        UUID id = UUID.randomUUID();
        MobileStation mobileStation = new MobileStation();
        mobileStation.setId(id);
        mobileStation.setLastKnownX(10);
        mobileStation.setLastKnownY(20);

        Mockito.when(repository.findById(id)).thenReturn(Optional.of(mobileStation));

        MobileStationLocationDto location = service.getLocation(id);
        assertEquals(mobileStation.getLastKnownX(), location.getX());
        assertEquals(mobileStation.getLastKnownY(), location.getY());
    }
}
