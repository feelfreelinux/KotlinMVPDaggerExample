package io.github.feelfree.devbord.models

data class Board(
        val id : String,
        val name : String = "",
        val areas : List<Area> = emptyList()
)