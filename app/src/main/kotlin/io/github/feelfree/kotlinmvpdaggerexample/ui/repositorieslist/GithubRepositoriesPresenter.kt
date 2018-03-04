package io.github.feelfree.kotlinmvpdaggerexample.ui.repositorieslist

import io.github.feelfree.kotlinmvpdaggerexample.api.repository.users.UsersApi
import io.github.feelfree.kotlinmvpdaggerexample.base.BasePresenter
import io.github.feelfree.kotlinmvpdaggerexample.base.Schedulers

class GithubRepositoriesPresenter(val schedulers: Schedulers, val usersApi: UsersApi) : BasePresenter<GithubRepositoriesView>() {
    var username = "feelfreelinux" // can be provided by view, but its just a simple example.
    fun loadRepository() {
        compositeObservable.add(
                usersApi.getRepositories(username)
                        .subscribeOn(schedulers.backgroundThread())
                        .observeOn(schedulers.mainThread())
                        .subscribe({ view?.showRepositories(it) }, { view?.showErrorDialog(it) })
        )
    }
}