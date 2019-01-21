package com.panshi.loansdk;

import android.app.Application;

import com.moxie.client.manager.MoxieSDK;
import com.panshi.makepoint.MakePoint;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
//        MoxieSDK.init(this);
        MakePoint.initMakePoint(this,8888);
    }
}
