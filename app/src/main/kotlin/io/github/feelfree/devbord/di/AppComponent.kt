package io.github.feelfree.devbord.di

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import io.github.feelfree.devbord.DevbordApp
import io.github.feelfree.devbord.di.modules.NetworkModule
import io.github.feelfree.devbord.di.modules.RepositoryModule
import javax.inject.Singleton

@Singleton
@Component( modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    NetworkModule::class,
    RepositoryModule::class,
    ActivityBuilder::class] )
internal interface AppComponent : AndroidInjector<DevbordApp> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<DevbordApp>()
}