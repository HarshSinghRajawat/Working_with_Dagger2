package com.one.dummydagger2.Model;

import android.util.Log;

import javax.inject.Inject;

public class Processor {
    @Inject
    public Processor() {
        Log.d("myMobile", "Processor: ");
    }
}
