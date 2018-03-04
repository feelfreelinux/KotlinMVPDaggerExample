package io.github.feelfree.kotlinmvpdaggerexample.di

import android.content.Context
import dagger.Binds
import dagger.Module
import io.github.feelfree.kotlinmvpdaggerexample.KotlinDaggerExampleApplication

@Module
abstract class AppModule {
    // Binds acts like provide, but it just binds the class instance with its interface
    @Binds
    abstract fun provideContext(application: KotlinDaggerExampleApplication) : Context
}