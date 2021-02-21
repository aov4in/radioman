package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadiomanTestAdvanced {
    @Test
    public void shouldNextStationNumber1() {
        RadiomanAdvanced radioman = new RadiomanAdvanced();
        radioman.setCurrentStationNumber(5);
        radioman.nextStationNumber();

        assertEquals(6, radioman.getCurrentStationNumber());

    }

    @Test
    public void shouldNextStationNumber2() {
        RadiomanAdvanced radioman = new RadiomanAdvanced();
        radioman.setCurrentStationNumber(9);
        radioman.nextStationNumber();

        assertEquals(0, radioman.getCurrentStationNumber());

    }

    @Test
    public void shouldNextStationNumber3() {
        RadiomanAdvanced radioman = new RadiomanAdvanced();
        radioman.setCurrentStationNumber(11);
        radioman.nextStationNumber();

        assertEquals(1, radioman.getCurrentStationNumber());

    }

    @Test
    public void shouldNextStationNumber4() {
        RadiomanAdvanced radioman = new RadiomanAdvanced();
        radioman.setCurrentStationNumber(-1);
        radioman.nextStationNumber();

        assertEquals(1, radioman.getCurrentStationNumber());

    }


    @Test
    public void shouldPrevStationNumber1() {
        RadiomanAdvanced radioman = new RadiomanAdvanced();
        radioman.setCurrentStationNumber(5);
        radioman.prevStationNumber();

        assertEquals(4, radioman.getCurrentStationNumber());

    }

    @Test
    public void shouldPrevStationNumber2() {
        RadiomanAdvanced radioman = new RadiomanAdvanced();
        radioman.setCurrentStationNumber(0);
        radioman.prevStationNumber();

        assertEquals(9, radioman.getCurrentStationNumber());

    }

    @Test
    public void shouldPrevStationNumber3() {
        RadiomanAdvanced radioman = new RadiomanAdvanced();
        radioman.setCurrentStationNumber(11);
        radioman.prevStationNumber();

        assertEquals(9, radioman.getCurrentStationNumber());

    }

    @Test
    public void shouldPrevStationNumber4() {
        RadiomanAdvanced radioman = new RadiomanAdvanced();
        radioman.setCurrentStationNumber(-2);
        radioman.prevStationNumber();

        assertEquals(9, radioman.getCurrentStationNumber());

    }

    @Test
    public void shouldVolumeUp1() {
        RadiomanAdvanced radioman = new RadiomanAdvanced();
        radioman.setCurrentVolume(5);
        radioman.volumeUp();

        assertEquals(6, radioman.getCurrentVolume());
    }

    @Test
    public void shouldVolumeUp2() {
        RadiomanAdvanced radioman = new RadiomanAdvanced();
        radioman.setCurrentVolume(15);
        radioman.volumeUp();

        assertEquals(1, radioman.getCurrentVolume());
    }

    @Test
    public void shouldVolumeUp3() {
        RadiomanAdvanced radioman = new RadiomanAdvanced();
        radioman.setCurrentVolume(-2);
        radioman.volumeUp();

        assertEquals(1, radioman.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDown1() {
        RadiomanAdvanced radioman = new RadiomanAdvanced();
        radioman.setCurrentVolume(6);
        radioman.volumeDown();

        assertEquals(5, radioman.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDown2() {
        RadiomanAdvanced radioman = new RadiomanAdvanced();
        radioman.setCurrentVolume(9);
        radioman.volumeDown();

        assertEquals(8, radioman.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDown3() {
        RadiomanAdvanced radioman = new RadiomanAdvanced();
        radioman.setCurrentVolume(-1);
        radioman.volumeDown();

        assertEquals(0, radioman.getCurrentVolume());
    }
}