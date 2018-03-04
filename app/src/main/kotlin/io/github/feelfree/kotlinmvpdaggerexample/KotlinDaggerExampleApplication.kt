package io.github.feelfree.kotlinmvpdaggerexample

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import io.github.feelfree.kotlinmvpdaggerexample.di.DaggerAppComponent

class KotlinDaggerExampleApplication : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }

    companion object {
        val BASE_URL = "https://api.github.com"
    }
}