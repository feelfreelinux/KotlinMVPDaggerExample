package io.github.feelfree.devbord

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import io.github.feelfree.devbord.di.DaggerAppComponent

class DevbordApp : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }

    companion object {
        val BASE_URL = "https://localhost:4466"
    }
}