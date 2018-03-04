package io.github.feelfree.kotlinmvpdaggerexample.api.repository.users

import io.github.feelfree.kotlinmvpdaggerexample.api.mapper.GithubRepositoryMapper
import io.github.feelfree.kotlinmvpdaggerexample.api.models.dataclass.GithubRepository
import io.reactivex.Single
import retrofit2.Retrofit

// Only used in dependency injection, don not create this class directly
// Maps api models with UI / viewholder models
class UsersRepository(val retrofit: Retrofit) : UsersApi {
    private val usersApi by lazy { retrofit.create(UsersRetrofitApi::class.java) }

    override fun getRepositories(username: String): Single<List<GithubRepository>> =
            usersApi.getUserRepositories(username)
                    .map { it.map { GithubRepositoryMapper.map(it) } }

}