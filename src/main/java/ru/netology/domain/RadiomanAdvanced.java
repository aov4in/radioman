package ru.netology.domain;

public class RadiomanAdvanced {
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private int stationNumberMin = 0;
    private int stationNumberMax = 10;
    private int currentStationNumber;

    public RadiomanAdvanced(int maxVolume, int minVolume, int currentVolume, int stationNumberMin, int stationNumberMax, int currentStationNumber) {
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
        this.stationNumberMin = stationNumberMin;
        this.stationNumberMax = stationNumberMax;
        this.currentStationNumber = currentStationNumber;
    }



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

    public int getStationNumberMax(){
        return stationNumberMax;
    }

    public void setStationNumberMax(int stationNumberMax) {
        this.stationNumberMax = stationNumberMax;
    }

    public int getCurrentStationNumber() {

        return currentStationNumber;
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

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
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