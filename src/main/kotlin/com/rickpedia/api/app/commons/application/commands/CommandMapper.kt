package com.rickpedia.api.app.commons.application.commands

import java.io.Serializable

interface CommandMapper<E : Serializable, C : BaseCommand> {
    fun commandToEntity(command: C): E
}