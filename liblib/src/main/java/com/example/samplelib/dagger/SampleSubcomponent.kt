package com.example.samplelib.dagger

import dagger.Subcomponent

@Subcomponent(
        modules = arrayOf(DaggerSampleLibModule::class)
)
interface SampleSubcomponent {
//    val libUtilityClass: LibUtilityClass
//
//    @Subcomponent.Builder
//    interface Builder {
//        fun daggerSampleLibModule(module: DaggerSampleLibModule): Builder
//        fun build(): LibUtilityClass
//    }
}