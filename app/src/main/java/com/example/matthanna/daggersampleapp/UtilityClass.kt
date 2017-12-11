package com.example.matthanna.daggersampleapp

import android.content.pm.PackageManager
import javax.inject.Inject

class UtilityClass {

    @Inject
    lateinit var packageManager: PackageManager

    fun doSomething() {

    }
}
