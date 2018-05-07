package io.github.feelfree.devbord.di.modules

import com.apollographql.apollo.ApolloClient
import dagger.Module
import dagger.Provides
import io.github.feelfree.devbord.api.repository.boards.BoardsApi
import io.github.feelfree.devbord.api.repository.boards.BoardsRepository

@Module
class RepositoryModule {
    @Provides
    fun provideBoardsApi(apolloClient: ApolloClient) : BoardsApi = BoardsRepository(apolloClient)
}