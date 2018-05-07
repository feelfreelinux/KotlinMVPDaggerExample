package io.github.feelfree.devbord.ui.adapter.viewholders

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.board_item.*

// Use layoutContainer to cache views. It improves scroll performance
class GithubRepositoryViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer {
    fun bindView(repository : String) {
        //repositoryDescriptionTextView.text = repository.description
        //repositoryTitleTextView.text = repository.name
    }
}