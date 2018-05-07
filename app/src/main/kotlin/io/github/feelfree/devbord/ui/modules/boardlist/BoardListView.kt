package io.github.feelfree.devbord.ui.modules.boardlist

import io.github.feelfree.devbord.GetBoardsQuery

interface BoardListView {
    fun showBoards(list : List<GetBoardsQuery.Data>)
}