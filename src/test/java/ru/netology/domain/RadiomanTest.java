package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadiomanTest {

    @Test
    public void createRadiomanVolume(){
        Radioman radioman = new Radioman();
        assertEquals(10, radioman.maxVolume);
        assertEquals(0, radioman.minVolume);
        assertEquals(0, radioman.currentVolume);

    }
    @Test
    public void createRadiomanStation(){
        Radioman radioman = new Radioman();
        assertEquals(9, radioman.stationNumberMax);
        assertEquals(0, radioman.stationNumberMin);
        assertEquals(0, radioman.CurrentStationNumber);

    }
}
