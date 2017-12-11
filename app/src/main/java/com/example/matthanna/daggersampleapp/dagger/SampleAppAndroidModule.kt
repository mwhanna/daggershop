package com.example.matthanna.daggersampleapp.dagger

import com.example.matthanna.daggersampleapp.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
@Suppress("unused")
abstract class SampleAppAndroidModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}