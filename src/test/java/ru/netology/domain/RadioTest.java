package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {


    @Test
    public void shouldCurrentStationMax() {
        Radio radio = new Radio(9, 9, 0, 10);

        assertEquals(9, radio.getStationMax());
    }

    @Test
    public void shouldCurrentStationMin() {
        Radio radio = new Radio(0, 9,0, 10);

        assertEquals(0, radio.getStationMin());
    }

    @Test
    public void shouldCurrentStationAfterMax() {
        Radio radio = new Radio(10, 9, 0, 10);

       assertEquals(0, radio.getStationMin());
    }

    @Test
    public void shouldCurrentStationAnderMin() {
        Radio radio = new Radio(-1, 9, 0, 10);

      assertEquals(9, radio.getStationMax());
    }

    @Test
    public void shouldCurrentStation() {
        Radio radio = new Radio(5, 9, 0, 10);

        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio(5, 9, 0, 10);

        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStationAfterMax() {
        Radio radio = new Radio(9, 9, 0, 10);

        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldPreviousStationMiddle() {
        Radio radio = new Radio(5, 9, 0, 10);

        radio.previousStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldPreviousStationAfterMin() {
        Radio radio = new Radio(0, 9, 0, 10);

        radio.previousStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldCurrentVolume() {
        Radio radio = new Radio(50, 100, 0);

        assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void shouldCurrentVolumeMax() {
        Radio radio = new Radio(100, 100, 0);


        assertEquals(100, radio.getVolumeMax());
    }

    @Test
    public void shouldCurrentVolumeMin() {
        Radio radio = new Radio(0, 100, 0);


        assertEquals(0, radio.getVolumeMin());
    }

    @Test
    public void shouldIncreaseVolumeMin() {
        Radio radio = new Radio(0, 100, 0);

        radio.increaseCurrentVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeMiddle() {
        Radio radio = new Radio(50, 100, 0);

        radio.increaseCurrentVolume();
        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeAfterMax() {
        Radio radio = new Radio(100, 100,0);

        radio.increaseCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeMiddle() {
        Radio radio = new Radio(50, 100, 0);

        radio.descreaseCurrentVolume();
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeMax() {
        Radio radio = new Radio(100, 100, 0);

        radio.descreaseCurrentVolume();
        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeAfterMin() {
        Radio radio = new Radio(0, 100, 0);

        radio.descreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

}
