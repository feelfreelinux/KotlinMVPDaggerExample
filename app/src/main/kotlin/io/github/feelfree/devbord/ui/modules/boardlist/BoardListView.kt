package io.github.feelfree.devbord.ui.modules.boardlist

import io.github.feelfree.devbord.GetBoardsQuery
import io.github.feelfree.devbord.base.BaseView
import io.github.feelfree.devbord.models.Board

interface BoardListView : BaseView {
    fun showBoards(list : List<Board>)
}