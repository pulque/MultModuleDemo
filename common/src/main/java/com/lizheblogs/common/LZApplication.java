package com.lizheblogs.common;

import android.app.Application;

/**
 * Created by LiZhe on 2018-07-30.
 * com.lizheblogs.common
 */
public class LZApplication extends Application {

    private static LZApplication application;

    /**
     * Gets Application object
     *
     * @return
     */
    public static synchronized LZApplication getInstance() {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }
}
