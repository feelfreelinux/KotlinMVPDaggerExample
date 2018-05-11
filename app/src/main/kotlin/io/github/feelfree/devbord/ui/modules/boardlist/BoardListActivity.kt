package io.github.feelfree.devbord.ui.modules.boardlist

import android.os.Bundle
import io.github.feelfree.devbord.R
import io.github.feelfree.devbord.base.BaseActivity
import io.github.feelfree.devbord.models.Board
import io.github.feelfree.devbord.ui.adapter.BoardAdapter
import io.github.feelfree.devbord.utils.isVisible
import io.github.feelfree.devbord.utils.prepare
import kotlinx.android.synthetic.main.activity_boards.*
import kotlinx.android.synthetic.main.toolbar.*
import javax.inject.Inject

class BoardListActivity : BaseActivity(), BoardListView {
    @Inject
    lateinit var adapter : BoardAdapter


    @Inject lateinit var presenter : BoardListPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boards)
        setSupportActionBar(toolbar)
        supportActionBar?.setTitle(R.string.boardlist_title)

        // Setup RecyclerView
        recyclerView.prepare()
        recyclerView.adapter = adapter

        swiperefresh.setOnRefreshListener {
            presenter.loadBoards()
        }

        // Load data
        loadingView.isVisible = true
        presenter.subscribe(this)
        presenter.loadBoards()
    }

    // Show list of boards
    override fun showBoards(list: List<Board>) {
        adapter.showBoards(list)
        loadingView.isVisible = false
        swiperefresh.isRefreshing = false
    }

    override fun onDestroy() {
        presenter.unsubscribe()
    }
}