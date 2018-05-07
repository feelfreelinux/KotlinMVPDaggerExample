package io.github.feelfree.devbord.models

data class Card(
        val id : String,
        val title : String = "",
        val content : String = "",
        val index : Long = 0,
        val area : Area
)