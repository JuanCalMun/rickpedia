package com.rickpedia.api.app.universe.application.commons

import com.rickpedia.api.app.commons.application.commands.CommandMapper
import com.rickpedia.api.app.commons.application.objects.DtoMapper
import com.rickpedia.api.app.universe.application.commons.commands.UniverseCreatorCommand
import com.rickpedia.api.app.universe.domain.Universe
import org.springframework.stereotype.Component

@Component
class UniverseMapper :
        DtoMapper<Universe, UniverseDto>,
        CommandMapper<Universe, UniverseCreatorCommand> {

    override fun entityToDto(entity: Universe) = UniverseDto(
            id = entity.id,
            name = entity.name,
            description = entity.description)

    override fun dtoToEntity(dto: UniverseDto) = Universe(
            id = dto.id,
            name = dto.name,
            description = dto.description)

    override fun commandToEntity(command: UniverseCreatorCommand): Universe {
        return Universe(command.name, command.description)
    }
}