package com.example.matthanna.daggersampleapp;

import com.example.matthanna.daggersampleapp.dagger.AppContextModule;
import com.example.matthanna.daggersampleapp.dagger.SampleAppComponent;
import com.example.matthanna.daggersampleapp.dagger.DaggerSampleAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class SampleApp extends DaggerApplication implements SampleAppComponent {

    private static SampleApp sAppContext;
    private SampleAppComponent mSampleAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        sAppContext = this;
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        mSampleAppComponent = DaggerSampleAppComponent.builder()
                .appContextModule(new AppContextModule(this))
                .build();
        return mSampleAppComponent;
    }
}
