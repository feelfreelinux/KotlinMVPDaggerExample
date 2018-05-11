package io.github.feelfree.devbord.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.github.feelfree.devbord.ui.modules.boardlist.BoardListActivity
import io.github.feelfree.devbord.ui.modules.boardlist.BoardListModule

// Every activity that extends BaseActivity should be bind there
@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [BoardListModule::class])
    abstract fun bindBoardListActivity() : BoardListActivity
}
