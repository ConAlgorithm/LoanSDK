package com.panshi.loansdk;

import android.app.Application;

import com.moxie.client.manager.MoxieSDK;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MoxieSDK.init(this);
    }
}
