package com.yet.spring.core.beans;

import java.text.DateFormat;
import java.util.Date;

public class Event {
    private static int idCounter = 1;
    private int id;
    private String msg;
    private Date date;
    private DateFormat dateFormat;
    private EventType type;

    public Event(Date date, DateFormat dateFormat) {
        this.id = idCounter;
        this.date = date;
        this.dateFormat = dateFormat;
        idCounter++;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + dateFormat.format(date) +
                '}';
    }
}
