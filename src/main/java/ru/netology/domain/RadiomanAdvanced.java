package ru.netology.domain;

public class RadiomanAdvanced {
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume;
    private int stationNumberMin = 0;
    private int stationNumberMax = 9;
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
            this.currentVolume = minVolume;
            return;
        }
        currentVolume ++;
    }

    public void volumeDown(){
        if (currentVolume == minVolume){
            this.currentVolume = maxVolume;
            return;
        }
        currentVolume --;
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber > stationNumberMax){
            this.currentStationNumber = stationNumberMax;
            return;
        }
        if (currentStationNumber < stationNumberMin){
            this.currentStationNumber = stationNumberMin;
            return;
        }

        this.currentStationNumber = currentStationNumber;

    }

    public int getCurrentVolume() {
        return currentVolume;
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