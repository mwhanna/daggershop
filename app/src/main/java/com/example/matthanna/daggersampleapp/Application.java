package com.example.matthanna.daggersampleapp;

import dagger.android.support.DaggerApplication;

public abstract class Application extends DaggerApplication {

    private static Application appContext;

    @Override
    public void onCreate() {
        super.onCreate();

        appContext = this;
    }

}
