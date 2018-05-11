package io.github.feelfree.devbord.ui.modules.boardlist

import io.github.feelfree.devbord.api.repository.boards.BoardsApi
import io.github.feelfree.devbord.base.BasePresenter
import io.github.feelfree.devbord.base.Schedulers

class BoardListPresenter(val schedulers : Schedulers, val boardsApi: BoardsApi) : BasePresenter<BoardListView>() {
    fun loadBoards() {
        compositeObservable.add(
                boardsApi.getBoards()
                        .subscribeOn(schedulers.backgroundThread())
                        .observeOn(schedulers.mainThread())
                        .subscribe(
                                { view?.showBoards(it) },
                                { view?.showErrorDialog(it) })
        )
    }
}