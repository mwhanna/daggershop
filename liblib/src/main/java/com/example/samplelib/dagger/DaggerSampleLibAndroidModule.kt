package com.example.samplelib.dagger

import com.example.samplelib.dagger.main.EmptyActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
@Suppress("unused")
abstract class DaggerSampleLibAndroidModule {

    @ContributesAndroidInjector()
    abstract fun emptyActivity(): EmptyActivity
}