package io.github.feelfree.devbord.api.mappers

import io.github.feelfree.devbord.CreateBoardMutation
import io.github.feelfree.devbord.models.Board

class CreateBoardMutationMapper {
    companion object {
        val boardMapper : Mapper<CreateBoardMutation.Data, Board> = {
            Board(it.createBoard().id(), it.createBoard().name())
        }
    }
}