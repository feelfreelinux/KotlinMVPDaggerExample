package io.github.feelfree.kotlinmvpdaggerexample.ui.repositorieslist

import dagger.Module
import dagger.Provides
import io.github.feelfree.kotlinmvpdaggerexample.api.repository.users.UsersApi
import io.github.feelfree.kotlinmvpdaggerexample.base.Schedulers

@Module
class GithubRepositoriesModule {
    // You could use constructor injection, but I prefer this way
    @Provides
    fun providePresenter(schedulers: Schedulers, usersApi: UsersApi)  = GithubRepositoriesPresenter(schedulers, usersApi)
}