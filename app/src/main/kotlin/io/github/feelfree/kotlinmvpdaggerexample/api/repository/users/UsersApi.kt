package io.github.feelfree.kotlinmvpdaggerexample.api.repository.users

import io.github.feelfree.kotlinmvpdaggerexample.api.models.dataclass.GithubRepository
import io.reactivex.Single

// This interface is directly exposed to presenters. Can be replaced by mocks for testing
interface UsersApi {
    fun getRepositories(username : String) : Single<List<GithubRepository>>
}