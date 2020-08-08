package com.rickpedia.api.app.universe.application.create

import com.rickpedia.api.app.commons.domain.exceptions.EntityEnum
import com.rickpedia.api.app.commons.domain.exceptions.customs.EntityAllreadyExistsCustomException
import com.rickpedia.api.app.universe.application.commons.UniverseDto
import com.rickpedia.api.app.universe.application.commons.UniverseDtoMapper
import com.rickpedia.api.app.universe.application.commons.commands.UniverseCommandsMapper
import com.rickpedia.api.app.universe.domain.Universe
import com.rickpedia.api.app.universe.domain.UniverseRepository
import org.springframework.stereotype.Service

@Service
class UniverseCreator(
        private val universeRepository: UniverseRepository,
        private val universeDtoMapper: UniverseDtoMapper,
        private val universeCommandsMapper: UniverseCommandsMapper
) {
    fun create(universeCreatorCommand: UniverseCreatorCommand): UniverseDto {
        val universeToCreate = loadUniverseFromCommand(universeCreatorCommand)
        if (universeExists(universeToCreate))
            throw EntityAllreadyExistsCustomException(EntityEnum.UNIVERSE)
        val savedUniverse = universeRepository.save(universeToCreate)
        return universeDtoMapper.entityToDto(savedUniverse)
    }

    private fun loadUniverseFromCommand(command: UniverseCreatorCommand) =
            universeCommandsMapper.commandToEntity(command)

    private fun universeExists(universe: Universe): Boolean =
            universeRepository.existsByName(universe.name.toUpperCase())
}