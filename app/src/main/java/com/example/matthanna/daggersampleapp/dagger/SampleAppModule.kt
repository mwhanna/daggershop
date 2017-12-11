package com.example.matthanna.daggersampleapp.dagger

import android.content.Context
import android.content.pm.PackageManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = arrayOf(SampleAppAndroidModule::class))
@Suppress("unused")
class SampleAppModule {
    @Provides
    @Singleton
    internal fun providePackageManager(@ForApplication context: Context): PackageManager = context.packageManager
}