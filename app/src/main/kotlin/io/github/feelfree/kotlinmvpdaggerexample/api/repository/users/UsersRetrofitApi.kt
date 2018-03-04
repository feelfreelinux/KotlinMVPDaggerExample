package io.github.feelfree.kotlinmvpdaggerexample.api.repository.users

import io.github.feelfree.kotlinmvpdaggerexample.api.models.apimodels.GithubRepositoryResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

// Retrofit's interface used for creating api object. Base path is specified in di/
interface UsersRetrofitApi {
    @GET("/users/{username}/repos")
    fun getUserRepositories(@Path("username") username : String) : Single<List<GithubRepositoryResponse>>
}