package com.example.samplelib.dagger

import com.example.samplelib.dagger.main.LibUtilityClass
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(
        includes = arrayOf(DaggerSampleLibAndroidModule::class)
)
@Suppress("Unused")
class DaggerSampleLibModule {

    @Provides
    @Singleton
    internal fun provideLibUtilityClass() = LibUtilityClass()

}