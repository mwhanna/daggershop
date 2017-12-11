package com.example.samplelib.dagger

import com.example.samplelib.dagger.main.ScopedActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
@Suppress("unused")
abstract class DaggerActivityAndroidModule {

    @ContributesAndroidInjector
    abstract fun scopedActivity(): ScopedActivity
}