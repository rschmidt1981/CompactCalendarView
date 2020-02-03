package com.github.sundeepk.compactcalendarview.domain;

/**
 * This class will highlight a day in a given color and will not be marked as an event indicator
 */
public class EventDay extends Event {


    public EventDay(int color, long timeInMillis) {
        super(color, timeInMillis);
    }
}
