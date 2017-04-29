package com.example.muhanxi.eventbusdemo;

import android.os.Bundle;
import android.app.Activity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class Main3Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);






        EventBus.getDefault().register(this);


    }


    @Subscribe(threadMode = ThreadMode.MAIN , sticky = true)
    public void onEvent(EventBean eventBean){

        System.out.println("eventBean = Main3Activity " + eventBean.isUp()+ "  " + Thread.currentThread().getName());

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

//        EventBus.getDefault().removeStickyEvent(EventBean.class);

        EventBus.getDefault().removeAllStickyEvents();

        EventBus.getDefault().unregister(this);

    }
}
