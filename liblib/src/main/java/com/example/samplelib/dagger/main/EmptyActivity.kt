package com.example.samplelib.dagger.main

import android.os.Bundle
import android.os.PersistableBundle
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class EmptyActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var libUtilityClass: LibUtilityClass

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        libUtilityClass.doSomethingFromALibrary("SOMETHING")
    }
}