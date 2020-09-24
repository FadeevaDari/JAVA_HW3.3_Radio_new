package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor

public class Radio {
    private int currentStation;
    private int stationMax = 9;
    private int stationMin = 0;
    private int amountStation = 10;
    private int currentVolume;
    private int volumeMax = 100;
    private int volumeMin = 0;

    public Radio(int currentStation, int stationMax, int stationMin, int amountStation) {
        if (currentStation > stationMax)
            this.currentStation = stationMin;

        if (currentStation < stationMin)
            this.currentStation = stationMax;
        this.currentStation = currentStation;
        this.stationMax = stationMax;
        this.stationMin = stationMin;
        this.amountStation = amountStation;
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


    public Radio(int currentVolume, int volumeMax, int volumeMin) {

        if (currentVolume > volumeMax)
            return;

        if (currentVolume < volumeMin)
            return;
        this.currentVolume = currentVolume;
        this.volumeMax = volumeMax;
        this.volumeMin = volumeMin;
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

