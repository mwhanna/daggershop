package com.example.samplelib.dagger.main

import android.os.Bundle
import android.os.PersistableBundle
import dagger.android.support.DaggerAppCompatActivity

class ScopedActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)


    }
}