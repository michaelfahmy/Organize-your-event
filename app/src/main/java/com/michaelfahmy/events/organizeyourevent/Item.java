package com.michaelfahmy.events.organizeyourevent;

/**
 * Created by Michael Fahmy on 08/30/2015.
 */
public class Item {
    private String title;
    private String from;
    private String to;

    public Item(String title, String from, String to) {
        this.title = title;
        this.from = from;
        this.to = to;
    }

    public String getTitle() {
        return title;
    }
    public String getTime(){
        return from + " - " + to;
    }
}
