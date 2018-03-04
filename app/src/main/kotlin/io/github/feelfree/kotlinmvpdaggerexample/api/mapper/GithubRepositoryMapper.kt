package io.github.feelfree.kotlinmvpdaggerexample.api.mapper

import io.github.feelfree.kotlinmvpdaggerexample.api.models.apimodels.GithubRepositoryResponse
import io.github.feelfree.kotlinmvpdaggerexample.api.models.dataclass.GithubRepository

class GithubRepositoryMapper {
    // Of course in this example we could just create simple
    // GithubRepository with moshi annotations only for needed fields,
    // but in real usecase we should do most of data operations here.
    // For example, generate pretty date from Date object, eg.
    // UI models should contain exact data that is shown in viewholders

    companion object : Mapper<GithubRepositoryResponse, GithubRepository> {
        override fun map(value: GithubRepositoryResponse): GithubRepository {
            return GithubRepository( "@${value.name}", value.description)
        }

    }
}