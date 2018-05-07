package io.github.feelfree.devbord.api.mappers

import io.github.feelfree.devbord.GetBoardsQuery
import io.github.feelfree.devbord.models.Board

class GetBoardsQueryMapper {
    companion object {
        private val boardMapper : Mapper<GetBoardsQuery.Board, Board> = {
            Board(it.id(), it.name())
        }

        val dataMapper : Mapper<GetBoardsQuery.Data, List<Board>> = {
            it.boards().map(boardMapper)
        }
    }
}