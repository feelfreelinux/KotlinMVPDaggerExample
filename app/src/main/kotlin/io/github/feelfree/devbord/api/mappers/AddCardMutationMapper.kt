package io.github.feelfree.devbord.api.mappers

import io.github.feelfree.devbord.AddCardMutation
import io.github.feelfree.devbord.models.Card

class AddCardMutationMapper {
    companion object {
        val cardMapper : Mapper<AddCardMutation.Data, Card> = {
            cardFragmentMapper(it.createCard().fragments().cardFragment())
        }
    }
}