package com.example.samplelib.dagger

interface HasComponent {
    fun createComponent() : SampleLibScopedComponent
    val currentComponent: SampleLibScopedComponent
}