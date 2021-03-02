package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadiomanTestAdvanced {

    @Test
    public void shouldGetStationMaxNumber() {
        RadiomanAdvanced radioman = new RadiomanAdvanced(100, 0, 0,0,10,0);
        assertEquals(10, radioman.getStationNumberMax());
    }

    @Test
    public void shouldGetCurrentStationNumber(){
        RadiomanAdvanced radioman = new RadiomanAdvanced(100,0,0,0,10, 5);
        assertEquals(5, radioman.getCurrentStationNumber());
    }

    @Test
    public void shouldNextStationNumber1() {
        RadiomanAdvanced radioman = new RadiomanAdvanced(100, 0, 0,0,10,5);
        radioman.nextStationNumber();

        assertEquals(6, radioman.getCurrentStationNumber());

    }

    @Test
    public void shouldNextStationNumber2() {
        RadiomanAdvanced radioman = new RadiomanAdvanced(100, 0, 0,0,10,11);
        radioman.nextStationNumber();
        radioman.setCurrentStationNumber(10);

        assertEquals(10, radioman.getCurrentStationNumber());

    }

    @Test
    public void shouldNextStationNumber3() {
        RadiomanAdvanced radioman = new RadiomanAdvanced(100, 0, 0,0,10,11);
        radioman.nextStationNumber();
        radioman.setCurrentStationNumber(15);

        assertEquals(0, radioman.getCurrentStationNumber());

    }

    @Test
    public void shouldNextStationNumber4() {
        RadiomanAdvanced radioman = new RadiomanAdvanced(100, 0, 0,0,10,0);
        radioman.setCurrentStationNumber(-1);
        radioman.nextStationNumber();

        assertEquals(0, radioman.getCurrentStationNumber());

    }


    @Test
    public void shouldPrevStationNumber1() {
        RadiomanAdvanced radioman = new RadiomanAdvanced(100, 0, 0,0,10,5);
        radioman.prevStationNumber();

        assertEquals(4, radioman.getCurrentStationNumber());

    }

    @Test
    public void shouldPrevStationNumber2() {
        RadiomanAdvanced radioman = new RadiomanAdvanced(100, 0, 0,0,10,0);
        radioman.prevStationNumber();

        assertEquals(10, radioman.getCurrentStationNumber());

    }

    @Test
    public void shouldPrevStationNumber3() {
        RadiomanAdvanced radioman = new RadiomanAdvanced(100, 0, 0,0,10,11);
        radioman.prevStationNumber();

        assertEquals(10, radioman.getCurrentStationNumber());

    }

    @Test
    public void shouldPrevStationNumber4() {
        RadiomanAdvanced radioman = new RadiomanAdvanced(100, 0, 0,0,10,0);
        radioman.prevStationNumber();
        radioman.setCurrentStationNumber(-2);

        assertEquals(10, radioman.getCurrentStationNumber());

    }


    @Test
    public void shouldVolumeUp1() {
        RadiomanAdvanced radioman = new RadiomanAdvanced(100, 0, 5,0,10,0);
        radioman.volumeUp();

        assertEquals(6, radioman.getCurrentVolume());
    }

    @Test
    public void shouldVolumeUp2() {
        RadiomanAdvanced radioman = new RadiomanAdvanced(100, 0, 0,0,10,0);
        radioman.setCurrentVolume(101);
        radioman.volumeUp();

        assertEquals(100, radioman.getCurrentVolume());
    }

    @Test
    public void shouldVolumeUp3() {
        RadiomanAdvanced radioman = new RadiomanAdvanced(100, 0, 0,0,10,0);
        radioman.volumeUp();
        radioman.setCurrentVolume(-1);

        assertEquals(0, radioman.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDown1() {
        RadiomanAdvanced radioman = new RadiomanAdvanced(100, 0, 51,0,10,0);
        radioman.volumeDown();

        assertEquals(50, radioman.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDown2() {
        RadiomanAdvanced radioman = new RadiomanAdvanced(100, 0, 0,0,10,0);
        radioman.setCurrentVolume(99);
        radioman.volumeDown();

        assertEquals(98, radioman.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDown3() {
        RadiomanAdvanced radioman = new RadiomanAdvanced(100, 0, -1,0,10,0);
        radioman.volumeDown();
        radioman.setCurrentVolume(-1);

        assertEquals(0, radioman.getCurrentVolume());
    }
}