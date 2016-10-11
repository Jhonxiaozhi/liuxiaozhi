package com.oneofive;

import android.app.Application;

import com.oneofive.api.Resource;

/**
 * Created by 1509a on 2016/8/29.
 */
public class MyApplication extends Application {
    private static MyApplication application;
    private static Resource resource;

    @Override
    public void onCreate() {
        application = this;
        resource = new Resource("A6926404156020", "BC17D013-CAAD-FA3C-BAF6-99F39B496BB5", "");
        super.onCreate();
    }

    public static MyApplication getApplication() {
        return application;
    }

    public static Resource getApiResource() {
        return resource;
    }
}
