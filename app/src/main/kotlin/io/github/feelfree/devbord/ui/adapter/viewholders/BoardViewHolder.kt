package io.github.feelfree.devbord.ui.adapter.viewholders

import android.support.v7.widget.RecyclerView
import android.view.View
import io.github.feelfree.devbord.models.Board
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.board_item.*

// Use layoutContainer to cache views. It improves scroll performance
class BoardViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer {
    fun bindView(board : Board) {
        boardTitleTextView.text = board.name
    }
}