package com.juhe.weather;

import android.app.Application;

import com.thinkland.juheapi.common.CommonFun;

public class WeatherAppliation extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CommonFun.initialize(getApplicationContext());
    }
}
