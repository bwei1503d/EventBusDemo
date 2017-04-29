package com.example.muhanxi.eventbusdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by muhanxi on 17/4/29.
 */
public class MainActivityTest {
    @Before
    public void setUp() throws Exception {

        System.out.println("true = setUp" );
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("true = tearDown" );

    }

    @Test
    public void onCreate() throws Exception {


         int a = 11 / 0 ;



    }

    @Test
    public void onEvent() throws Exception {
        System.out.println("true = onEvent" );

        MainActivity mainActivity = new MainActivity();


    }

    @Test
    public void onDestroy() throws Exception {
        System.out.println("true = onDestroy" );

    }

}