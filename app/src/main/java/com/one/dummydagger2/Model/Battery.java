package com.one.dummydagger2.Model;

import android.util.Log;

import javax.inject.Inject;

public class Battery {
    @Inject
    public Battery() {
        Log.d("myMobile", "Battery: ");
    }
}
