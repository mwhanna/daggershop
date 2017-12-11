package com.example.samplelib.dagger

import dagger.Module

@Module(
        includes = arrayOf(DaggerSampleLibAndroidModule::class)
)
@Suppress("Unused")
class DaggerSampleLibModule {

}