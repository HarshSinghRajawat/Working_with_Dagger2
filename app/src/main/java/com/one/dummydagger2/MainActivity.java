package com.one.dummydagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.one.dummydagger2.Dagger.Component.DaggerMobileComponent;
import com.one.dummydagger2.Dagger.Component.MobileComponent;
import com.one.dummydagger2.Model.Mobile;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Mobile mobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMobileComponent.create().inject(this);
        mobile.run();
    }
}