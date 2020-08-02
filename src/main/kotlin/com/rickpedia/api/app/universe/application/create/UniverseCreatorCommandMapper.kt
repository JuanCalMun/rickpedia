package com.rickpedia.api.app.universe.application.create

import com.rickpedia.api.app.commons.application.commands.CommandMapper
import com.rickpedia.api.app.universe.domain.Universe
import org.springframework.stereotype.Service

@Service
class UniverseCreatorCommandMapper : CommandMapper<Universe, UniverseCreatorCommand> {
    override fun commandToEntity(command: UniverseCreatorCommand): Universe {
        return Universe(command.name, command.description)
    }
}