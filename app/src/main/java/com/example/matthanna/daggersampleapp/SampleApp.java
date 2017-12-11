package com.example.matthanna.daggersampleapp;

import com.example.matthanna.daggersampleapp.dagger.AppContextModule;
import com.example.matthanna.daggersampleapp.dagger.SampleAppComponent;
import com.example.matthanna.daggersampleapp.dagger.DaggerSampleAppComponent;
import com.example.samplelib.dagger.DaggerActivityModule;
import com.example.samplelib.dagger.HasComponent;
import com.example.samplelib.dagger.SampleLibScopedComponent;

import org.jetbrains.annotations.NotNull;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class SampleApp extends DaggerApplication implements SampleAppComponent, HasComponent {

    private static SampleApp sAppContext;
    private SampleAppComponent mSampleAppComponent;
    private SampleLibScopedComponent mSampleLibScopedComponent;

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

    @NotNull
    @Override
    public SampleLibScopedComponent createComponent() {
        mSampleLibScopedComponent = mSampleAppComponent.plus(new DaggerActivityModule());
        return mSampleLibScopedComponent;
    }

    @NotNull
    @Override
    public SampleLibScopedComponent getCurrentComponent() {
        if (mSampleLibScopedComponent == null) {
            throw new RuntimeException("Composer Component does not exist.");
        }
        return mSampleLibScopedComponent;
    }
}
