package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void shouldCurrentStationMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(9);
        assertEquals(9, radio.getStationMax());
    }

    @Test
    public void shouldCurrentStationMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(0);
        assertEquals(0, radio.getStationMin());
    }

    @Test
    public void shouldCurrentStationAfterMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldCurrentStationAnderMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());

        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStationAfterMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());

        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldPreviousStationMiddle() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());

        radio.previousStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldPreviousStationAfterMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());

        radio.previousStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldCurrentVolumeMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(10);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldCurrentVolumeMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeMiddle() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());

        radio.increaseCurrentVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeAfterMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        assertEquals(10, radio.getCurrentVolume());

        radio.increaseCurrentVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeMiddle() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());

        radio.descreaseCurrentVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeAfterMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());

        radio.descreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

}