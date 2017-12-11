package com.example.matthanna.daggersampleapp.dagger

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
@Suppress("unused")
class AppContextModule(private val context: Context) {

    @Provides
    @ForApplication
    fun provideAppContext(): Context = context
}