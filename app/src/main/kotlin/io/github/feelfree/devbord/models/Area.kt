package io.github.feelfree.devbord.models

data class Area(
        val id : String,
        val name : String = "",
        val cards : List<Card> = emptyList()
)