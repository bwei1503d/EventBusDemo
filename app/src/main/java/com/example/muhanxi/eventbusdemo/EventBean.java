package com.example.muhanxi.eventbusdemo;

/**
 * Created by muhanxi on 17/4/28.
 */

public class EventBean {



    public boolean up ;

    public  EventBean(boolean up){

        this.up = up ;

    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }
}
