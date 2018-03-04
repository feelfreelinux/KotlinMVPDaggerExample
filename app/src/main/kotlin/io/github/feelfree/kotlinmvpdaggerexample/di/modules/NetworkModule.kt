package io.github.feelfree.kotlinmvpdaggerexample.di.modules

import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import io.github.feelfree.kotlinmvpdaggerexample.KotlinDaggerExampleApplication
import io.github.feelfree.kotlinmvpdaggerexample.base.ApplicationSchedulers
import io.github.feelfree.kotlinmvpdaggerexample.base.Schedulers
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

// Provides network-related classes
@Module
class NetworkModule {
    @Provides
    fun provideApplicationSchedulers() : Schedulers = ApplicationSchedulers()

    @Provides
    @Singleton
    fun provideMoshi() = Moshi.Builder().build()

    @Provides
    @Singleton
    fun provideRetrofit(client: OkHttpClient, moshi: Moshi) : Retrofit {
        return Retrofit.Builder()
                .client(client)
                .baseUrl(KotlinDaggerExampleApplication.BASE_URL)
                .addConverterFactory(MoshiConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
    }
}