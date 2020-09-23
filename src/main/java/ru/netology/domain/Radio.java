package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int stationMax = 9;
    private int stationMin = 0;
    private int currentVolume;
    private int volumeMax = 10;
    private int volumeMin = 0;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > stationMax)
            return;

        if (currentStation < stationMin)
            return;
        this.currentStation = currentStation;
    }

    public int getStationMax() {
        return stationMax;
    }


    public int getStationMin() {
        return stationMin;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > volumeMax)
            return;

        if (currentVolume < volumeMin)
            return;
        this.currentVolume = currentVolume;
    }

    public int getVolumeMax() {
        return volumeMax;
    }


    public int getVolumeMin() {
        return volumeMin;
    }

    public void nextStation() {
        if (currentStation == stationMax) {
            this.currentStation = stationMin;
        } else {
            currentStation++;
        }
    }

    public void previousStation() {
        if (currentStation == stationMin) {
            this.currentStation = stationMax;
        } else {
            currentStation--;
        }
    }

    public void increaseCurrentVolume() {
        if (currentVolume < volumeMax)
            currentVolume++;
    }

    public void descreaseCurrentVolume() {
        if (currentVolume > volumeMin)
            currentVolume--;
    }

}
