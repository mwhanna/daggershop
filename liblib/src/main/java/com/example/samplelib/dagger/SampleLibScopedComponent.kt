package com.example.samplelib.dagger

import com.example.samplelib.dagger.main.ActivityScope
import com.example.samplelib.dagger.main.ScopedActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent(
        modules = arrayOf(DaggerActivityModule::class)
)
@Suppress("unused")
interface SampleLibScopedComponent {

    fun inject(activity: ScopedActivity)
}