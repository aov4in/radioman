package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class RadiomanAdvanced {
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private int stationNumberMin = 0;
    private int stationNumberMax = 10;
    private int currentStationNumber;

    public void nextStationNumber(){
        if (currentStationNumber == stationNumberMax){
            this.currentStationNumber = stationNumberMin;
            return;
        }
        currentStationNumber ++;
    }

    public void prevStationNumber(){
        if (currentStationNumber == stationNumberMin){
            this.currentStationNumber = stationNumberMax;
            return;
        }
        currentStationNumber --;
    }

    public void volumeUp(){
        if (currentVolume == maxVolume){
            return;
        }
        currentVolume ++;
    }

    public void volumeDown(){
        if (currentVolume == minVolume){
            return;
        }
        currentVolume --;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber > stationNumberMax){
            this.currentStationNumber = stationNumberMin;
            return;
        }
        if (currentStationNumber < stationNumberMin){
            this.currentStationNumber = stationNumberMax;
            return;
        }

        this.currentStationNumber = currentStationNumber;

    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume){
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume){
            this.currentVolume = minVolume;
            return;
        }

        this.currentVolume = currentVolume;
    }

}