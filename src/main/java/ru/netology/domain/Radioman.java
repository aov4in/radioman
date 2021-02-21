package ru.netology.domain;

public class Radioman {
    int maxVolume = 10;
    int minVolume = 0;
    int currentVolume;
    int stationNumberMin = 0;
    int stationNumberMax = 9;
    int CurrentStationNumber;
}
//package ru.netology.domain;
//
//public class RadiomanAdvanced {
//    private int maxVolume = 10;
//    private int minVolume = 0;
//    private int currentVolume;
//    private int stationNumberMin = 0;
//    private int stationNumberMax = 9;
//    private int currentStationNumber;
//
//    //    public void nextStationNumber() {
////        if (currentStationNumber > stationNumberMin | currentStationNumber < stationNumberMax) {
////            this.currentStationNumber = currentStationNumber + 1;
////        }
////
////        if (currentStationNumber <= stationNumberMin) {
////            this.currentStationNumber = stationNumberMin;
////        }
////
////        if (currentStationNumber >= stationNumberMax) {
////            this.currentStationNumber = stationNumberMax;
////        }
////
////    }
//    public void nextStationNumber(){
//        if (currentStationNumber == stationNumberMax){
//            this.currentStationNumber = stationNumberMin;
//            return;
//        }
//        currentStationNumber ++;
//    }
//
//    //    public void prevStationNumber() {
////        if (currentStationNumber > stationNumberMin & currentStationNumber <= stationNumberMax) {
////            this.currentStationNumber = currentStationNumber - 1;
////        }
////
////        if (currentStationNumber >= stationNumberMax) {
////            this.currentStationNumber = stationNumberMax;
////        }
////
////        if (currentStationNumber <= stationNumberMin) {
////            this.currentStationNumber = stationNumberMin;
////        }
////
////    }
//    public void prevStationNumber(){
//        if (currentStationNumber == stationNumberMin){
//            this.currentStationNumber = stationNumberMax;
//            return;
//        }
//        currentStationNumber --;
//    }
//
//
//    //    public void volumeUp() {
////        if (currentVolume >= minVolume | currentVolume < maxVolume) {
////            this.currentVolume = currentVolume + 1;
////        }
////
////        if (currentVolume >= maxVolume) {
////            this.currentVolume = maxVolume;
////        }
////
////        if (currentVolume <= minVolume) {
////            this.currentVolume = minVolume;
////        }
////
////    }
//    public void volumeUp(){
//        if (currentVolume == maxVolume){
//            this.currentVolume = minVolume;
//            return;
//        }
//        currentVolume ++;
//    }
//
//    //    public void volumeDown() {
////        if (currentVolume > minVolume & currentVolume <= maxVolume) {
////            this.currentVolume = currentVolume -1;
////        }
////
////        if (currentVolume <= minVolume) {
////            this.currentVolume = minVolume;
////        }
////
////        if (currentVolume >= maxVolume) {
////            this.currentVolume = maxVolume;
////        }
////
////    }
//    public void volumeDown(){
//        if (currentVolume == minVolume){
//            this.currentVolume = maxVolume;
//            return;
//        }
//        currentVolume --;
//    }
//
//    public int getCurrentStationNumber() {
//        return currentStationNumber;
//    }
//
//    public void setCurrentStationNumber(int currentStationNumber) {
//        if (currentStationNumber > stationNumberMax){
//            this.currentStationNumber = stationNumberMax;
//            return;
//        }
//        if (currentStationNumber < stationNumberMin){
//            this.currentStationNumber = stationNumberMin;
//            return;
//        }
//
//        this.currentStationNumber = currentStationNumber;
//
//    }
//
//    public int getCurrentVolume() {
//        return currentVolume;
//    }
//
//    public void setCurrentVolume(int currentVolume) {
//        if (currentVolume > maxVolume){
//            this.currentVolume = maxVolume;
//            return;
//        }
//        if (currentVolume < minVolume){
//            this.currentVolume = minVolume;
//            return;
//        }
//
//        this.currentVolume = currentVolume;
//    }
//}
