package com.github.sundeepk.compactcalendarview.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.support.annotation.Nullable;

public class Event {

    private int color;
    private long timeInMillis;
    private Object data;

    private int day;

    public Event(int color, long timeInMillis) {
        this.color = color;
        this.timeInMillis = timeInMillis;

        Date date = new Date();
        date.setTime(timeInMillis);
        day = Integer.parseInt(new SimpleDateFormat("dd").format(date));
    }

    public Event(int color, long timeInMillis, Object data) {
        this.color = color;
        this.timeInMillis = timeInMillis;
        this.data = data;

        Date date = new Date();
        date.setTime(timeInMillis);
        day = Integer.parseInt(new SimpleDateFormat("dd").format(date));
    }

    public int getColor() {
        return color;
    }

    public long getTimeInMillis() {
        return timeInMillis;
    }

    public int getDay() {
        return day;
    }

    @Nullable
    public Object getData() {
        return data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Event event = (Event) o;

        if (color != event.color) return false;
        if (timeInMillis != event.timeInMillis) return false;
        if (data != null ? !data.equals(event.data) : event.data != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = color;
        result = 31 * result + (int) (timeInMillis ^ (timeInMillis >>> 32));
        result = 31 * result + (data != null ? data.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Event{" +
                "color=" + color +
                ", timeInMillis=" + timeInMillis +
                ", data=" + data +
                '}';
    }
}
