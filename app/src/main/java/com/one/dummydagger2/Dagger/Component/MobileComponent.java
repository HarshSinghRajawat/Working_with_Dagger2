package com.one.dummydagger2.Dagger.Component;

import com.one.dummydagger2.MainActivity;
import com.one.dummydagger2.Model.Mobile;

import dagger.Component;

@Component
public interface MobileComponent {
    Mobile getMobile();
    void inject(MainActivity activity);
}
