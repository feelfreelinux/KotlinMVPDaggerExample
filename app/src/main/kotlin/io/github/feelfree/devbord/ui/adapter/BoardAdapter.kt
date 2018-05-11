package io.github.feelfree.devbord.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import io.github.feelfree.devbord.R
import io.github.feelfree.devbord.models.Board
import io.github.feelfree.devbord.ui.adapter.viewholders.BoardViewHolder
import io.github.feelfree.devbord.utils.inflate
import javax.inject.Inject

// We're injecting constructor here. All viewholder dependencies can get them from here.
class BoardAdapter @Inject constructor() : RecyclerView.Adapter<BoardViewHolder>() {
    val boards = arrayListOf<Board>()
    override fun onBindViewHolder(holder: BoardViewHolder, position: Int) {
        holder.apply {
            bindView(boards[position])
        }
    }

    fun showBoards(repos : List<Board>) {
        boards.apply {
            clear()
            addAll(repos)
            notifyDataSetChanged()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoardViewHolder =
            BoardViewHolder(parent.inflate(R.layout.board_item))
    override fun getItemCount(): Int = boards.size
}