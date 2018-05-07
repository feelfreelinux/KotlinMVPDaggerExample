package io.github.feelfree.devbord.api.mappers

import io.github.feelfree.devbord.GetBoardByIdQuery
import io.github.feelfree.devbord.models.Area
import io.github.feelfree.devbord.models.Board
import io.github.feelfree.devbord.models.Card

class GetBoardByIdQueryMapper {
    companion object {
        val cardMapper : Mapper<GetBoardByIdQuery.Card, Card> = {
            cardFragmentMapper(it.fragments().cardFragment())
        }
        val areaMapper : Mapper<GetBoardByIdQuery.Area, Area> = {
            Area(it.id(), it.name(), it.cards()?.map(cardMapper) ?: emptyList())
        }
        val boardMapper : Mapper<GetBoardByIdQuery.Data, Board> = {
            val board = it.board()!!
            Board(board.id(), board.name(), board.areas()?.map(areaMapper) ?: emptyList())
        }
    }
}