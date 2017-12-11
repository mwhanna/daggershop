package com.example.matthanna.daggersampleapp.dagger

import com.example.matthanna.daggersampleapp.NotificationManager
import com.example.matthanna.daggersampleapp.SampleApp
import com.example.matthanna.daggersampleapp.UtilityClass
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Component(
        modules = arrayOf(AndroidSupportInjectionModule::class)
)
@Singleton
@Suppress("unused")
interface SampleAppComponent : AndroidInjector<SampleApp> {

    fun inject(utilityClass: UtilityClass)

    fun inject(notificationManager: NotificationManager)
}