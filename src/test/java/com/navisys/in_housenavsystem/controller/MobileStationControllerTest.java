package com.navisys.in_housenavsystem.controller;

import com.navisys.in_housenavsystem.dto.MobileStationLocationDto;
import com.navisys.in_housenavsystem.service.MobileStationService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MobileStationController.class)
public class MobileStationControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MobileStationService service;

    @Test
    public void testGetLocation() throws Exception {
        UUID id = UUID.randomUUID();
        MobileStationLocationDto location = new MobileStationLocationDto();
        location.setMobileId(id);
        location.setX(10);
        location.setY(20);

        Mockito.when(service.getLocation(id)).thenReturn(location);

        mockMvc.perform(get("/location/" + id))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.mobileId", is(id.toString())))
                .andExpect(jsonPath("$.x", is(10.0)))
                .andExpect(jsonPath("$.y", is(20.0)));
    }
}
