package com.example.samplelib.dagger

import com.example.samplelib.dagger.main.ActivityScope
import com.example.samplelib.dagger.main.ScopedUtilClass
import dagger.Module
import dagger.Provides

@Module(
        includes = arrayOf(DaggerActivityAndroidModule::class)
)
@Suppress("unused")
class DaggerActivityModule {

    @ActivityScope
    @Provides
    internal fun provide() = ScopedUtilClass()
}
