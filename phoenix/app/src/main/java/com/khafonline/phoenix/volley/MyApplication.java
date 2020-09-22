
package com.khafonline.phoenix.volley;


import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {
    private static MyApplication mInstance;
    private static Context mAppContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

        this.setAppContext(getApplicationContext());
    }

    public static Context getAppContext() {

        return getInstance().getApplicationContext();
    }

    public static MyApplication getInstance() {
        return mInstance;
    }

    public static Context getContext() {
        return mAppContext;
    }

    public void setAppContext(Context mAppContext) {
        MyApplication.mAppContext = mAppContext;
    }



}
