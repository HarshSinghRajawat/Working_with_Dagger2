package com.one.dummydagger2.Model;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {
    Battery battery;
    Processor processor;
    @Inject
    public Mobile(Battery battery, Processor processor) {
        this.battery = battery;
        this.processor = processor;
        Log.d("myMobile", "Mobile: ");
    }
    public void run(){
        Log.d("myMobile", "run: ");
    }
}
