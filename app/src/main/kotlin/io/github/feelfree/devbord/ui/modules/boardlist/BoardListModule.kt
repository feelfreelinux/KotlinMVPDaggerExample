package io.github.feelfree.devbord.ui.modules.boardlist

import dagger.Module
import dagger.Provides
import io.github.feelfree.devbord.api.repository.boards.BoardsApi
import io.github.feelfree.devbord.base.Schedulers

@Module
class BoardListModule {
    @Provides
    fun providePresenter(schedulers: Schedulers, boardsApi: BoardsApi) = BoardListPresenter(schedulers, boardsApi)
}