package io.github.feelfree.devbord.api.mappers

import io.github.feelfree.devbord.fragment.CardFragment
import io.github.feelfree.devbord.models.Area
import io.github.feelfree.devbord.models.Card

val cardFragmentMapper : Mapper<CardFragment, Card> = {
    Card(it.id(), it.title(), it.content(), it.index(), cardFragmentAreaMapper(it.area()))
}

val cardFragmentAreaMapper : Mapper<CardFragment.Area, Area> = {
    Area(it.id())
}