package io.github.feelfree.kotlinmvpdaggerexample.di

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import io.github.feelfree.kotlinmvpdaggerexample.KotlinDaggerExampleApplication
import io.github.feelfree.kotlinmvpdaggerexample.di.modules.NetworkModule
import io.github.feelfree.kotlinmvpdaggerexample.di.modules.RepositoryModule
import javax.inject.Singleton

@Singleton
@Component( modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    NetworkModule::class,
    RepositoryModule::class,
    ActivityBuilder::class] )
internal interface AppComponent : AndroidInjector<KotlinDaggerExampleApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<KotlinDaggerExampleApplication>()
}