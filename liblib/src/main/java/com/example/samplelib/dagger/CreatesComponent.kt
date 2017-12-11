package com.example.samplelib.dagger

interface CreatesComponent {
    fun plus(child: DaggerActivityModule): SampleLibScopedComponent
}