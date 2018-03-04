package io.github.feelfree.kotlinmvpdaggerexample.di.modules

import dagger.Module
import dagger.Provides
import io.github.feelfree.kotlinmvpdaggerexample.api.repository.users.UsersApi
import io.github.feelfree.kotlinmvpdaggerexample.api.repository.users.UsersRepository
import retrofit2.Retrofit

@Module
class RepositoryModule {
    // Remember to provide repository with interface
    @Provides
    fun provideUsersApi(retrofit: Retrofit) : UsersApi = UsersRepository(retrofit)
}