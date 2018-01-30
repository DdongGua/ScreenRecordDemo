package com.example.screenrecorddemo;

import android.app.Application;

import com.guaju.screenrecorderlibrary.ScreenRecorderHelper;

/**
 *
 * @author 亮亮
 * @date 2018/1/30
 */

public class MyApplication extends Application {
    public static MyApplication app;
    private ScreenRecorderHelper instance;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        //init
        instance = ScreenRecorderHelper.getInstance(this);
    }

    public ScreenRecorderHelper getSRHelper() {
        return instance;
    }

    public static MyApplication getApp() {
        return app;
    }
}
