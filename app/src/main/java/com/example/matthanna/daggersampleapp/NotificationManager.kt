package com.example.matthanna.daggersampleapp

import android.content.Context
import javax.inject.Inject

class NotificationManager(context: Context) {

    @Inject
    lateinit var utilityClass : UtilityClass

    fun setup() {
        utilityClass.doSomething()
    }
}
