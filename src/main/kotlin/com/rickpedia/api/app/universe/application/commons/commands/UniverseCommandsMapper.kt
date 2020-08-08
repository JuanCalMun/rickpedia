package com.rickpedia.api.app.universe.application.commons.commands

import com.rickpedia.api.app.commons.application.commands.CommandMapper
import com.rickpedia.api.app.universe.application.create.UniverseCreatorCommand
import com.rickpedia.api.app.universe.domain.Universe
import org.springframework.stereotype.Component

@Component
class UniverseCommandsMapper :
        CommandMapper<Universe, UniverseCreatorCommand> {

    override fun commandToEntity(command: UniverseCreatorCommand): Universe {
        return Universe(command.name, command.description)
    }
}