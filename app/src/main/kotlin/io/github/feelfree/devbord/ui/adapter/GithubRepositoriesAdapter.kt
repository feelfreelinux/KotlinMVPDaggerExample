package io.github.feelfree.devbord.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import io.github.feelfree.devbord.R
import io.github.feelfree.devbord.ui.adapter.viewholders.GithubRepositoryViewHolder
import io.github.feelfree.devbord.utils.inflate
import javax.inject.Inject

// We're injecting constructor here. All viewholder dependencies can get them from here.
class GithubRepositoriesAdapter @Inject constructor() : RecyclerView.Adapter<GithubRepositoryViewHolder>() {
    val repositories = arrayListOf<String>()
    override fun onBindViewHolder(holder: GithubRepositoryViewHolder, position: Int) {
        holder.apply {
            //bindView(repositories[position])
        }
    }

    fun showRepositories(repos : List<String>) {
        repositories.apply {
            clear()
            addAll(repos)
            notifyDataSetChanged()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GithubRepositoryViewHolder =
            GithubRepositoryViewHolder(parent.inflate(R.layout.board_item))
    override fun getItemCount(): Int = repositories.size
}