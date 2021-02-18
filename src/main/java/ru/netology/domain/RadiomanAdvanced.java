package ru.netology.domain;

public class RadiomanAdvanced {
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume;
    private int stationNumberMin = 0;
    private int stationNumberMax = 9;
    private int currentStationNumber;

    public void nextStationNumber() {
        if (currentStationNumber >= stationNumberMin & currentStationNumber < stationNumberMax) {
            this.currentStationNumber = currentStationNumber + 1;
        }

        if (currentStationNumber == stationNumberMax | currentStationNumber < stationNumberMin) {
            this.currentStationNumber = stationNumberMin;
        }

        if (currentStationNumber > stationNumberMax) {
            this.currentStationNumber = stationNumberMax;
        }

    }

    public void prevStationNumber() {
        if (currentStationNumber > stationNumberMin & currentStationNumber <= stationNumberMax) {
            this.currentStationNumber = currentStationNumber - 1;
        }

        if (currentStationNumber == stationNumberMin | currentStationNumber > stationNumberMax) {
            this.currentStationNumber = stationNumberMax;
        }

        if (currentStationNumber < stationNumberMin) {
            this.currentStationNumber = stationNumberMin;
        }

    }


    public void volumeUp() {
        if (currentVolume >= minVolume & currentVolume < maxVolume) {
            this.currentVolume = currentVolume + 1;
        }

        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
        }

        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
        }

    }

    public void volumeDown() {
        if (currentVolume > minVolume & currentVolume <= maxVolume) {
            this.currentVolume = currentVolume - 1;
        }

        if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
        }

        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
        }

    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        this.currentStationNumber = currentStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
}
