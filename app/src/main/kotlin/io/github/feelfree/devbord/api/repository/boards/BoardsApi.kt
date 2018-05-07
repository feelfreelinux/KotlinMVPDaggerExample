package io.github.feelfree.devbord.api.repository.boards

import io.github.feelfree.devbord.CreateBoardMutation
import io.github.feelfree.devbord.GetBoardByIdQuery
import io.github.feelfree.devbord.GetBoardsQuery
import io.github.feelfree.devbord.models.Board
import io.reactivex.Single

interface BoardsApi {
    fun getBoards() : Single<List<Board>>
    fun getBoardById(id : String) : Single<Board>
    fun createBoard(name : String) : Single<Board>
}