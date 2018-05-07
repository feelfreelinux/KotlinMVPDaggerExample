package io.github.feelfree.devbord.api.repository.boards

import com.apollographql.apollo.ApolloClient
import io.github.feelfree.devbord.CreateBoardMutation
import io.github.feelfree.devbord.GetBoardByIdQuery
import io.github.feelfree.devbord.GetBoardsQuery
import io.github.feelfree.devbord.api.createApolloCall
import io.github.feelfree.devbord.api.mappers.AddCardMutationMapper
import io.github.feelfree.devbord.api.mappers.CreateBoardMutationMapper
import io.github.feelfree.devbord.api.mappers.GetBoardByIdQueryMapper
import io.github.feelfree.devbord.api.mappers.GetBoardsQueryMapper
import io.github.feelfree.devbord.models.Board
import io.github.feelfree.devbord.models.Card
import io.reactivex.Single

class BoardsRepository(val apolloClient: ApolloClient) : BoardsApi {
    override fun createBoard(name : String): Single<Board> {
        return createApolloCall(apolloClient.mutate(
                CreateBoardMutation.builder()
                        .name(name)
                        .build()))
                .map { CreateBoardMutationMapper.boardMapper(it) }
    }

    override fun getBoards(): Single<List<Board>> {
        return createApolloCall(apolloClient.query(
                GetBoardsQuery.builder()
                        .build()))
                .map { GetBoardsQueryMapper.dataMapper(it) }
    }

    override fun getBoardById(id : String): Single<Board> {
        return createApolloCall(apolloClient.query(
                GetBoardByIdQuery.builder()
                        .id(id)
                        .build()))
                .map { GetBoardByIdQueryMapper.boardMapper(it) }

    }
}