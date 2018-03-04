package io.github.feelfree.kotlinmvpdaggerexample.ui.repositorieslist

import io.github.feelfree.kotlinmvpdaggerexample.api.models.dataclass.GithubRepository
import io.github.feelfree.kotlinmvpdaggerexample.base.BaseView

interface GithubRepositoriesView : BaseView {
    fun showRepositories(repositories : List<GithubRepository>)
}