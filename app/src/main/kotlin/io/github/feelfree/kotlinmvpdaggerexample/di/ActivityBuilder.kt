package io.github.feelfree.kotlinmvpdaggerexample.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.github.feelfree.kotlinmvpdaggerexample.ui.repositorieslist.GithubRepositoriesActivity
import io.github.feelfree.kotlinmvpdaggerexample.ui.repositorieslist.GithubRepositoriesModule

// Every activity that extends BaseActivity should be bind there
@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [GithubRepositoriesModule::class])
    abstract fun bindGithubRepositoriesActivity() : GithubRepositoriesActivity
}
