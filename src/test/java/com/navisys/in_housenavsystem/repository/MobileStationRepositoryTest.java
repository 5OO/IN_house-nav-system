package com.navisys.in_housenavsystem.repository;

import com.navisys.in_housenavsystem.model.MobileStation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class MobileStationRepositoryTest {


    @Autowired
    private MobileStationRepository repository;

    @Test
    public void testSaveAndFind() {
        MobileStation mobileStation = new MobileStation();
        mobileStation.setId(UUID.randomUUID());
        mobileStation.setLastKnownX(10);
        mobileStation.setLastKnownY(20);
        repository.save(mobileStation);

        Optional<MobileStation> found = repository.findById(mobileStation.getId());
        assertTrue(found.isPresent());
        assertEquals(mobileStation.getId(), found.get().getId());
    }

}
