package com.rickpedia.api.app.universe.application.create

import com.rickpedia.api.app.commons.domain.exceptions.customs.EntityAllreadyExistsCustomException
import com.rickpedia.api.app.universe.application.commons.UniverseDto
import com.rickpedia.api.app.universe.application.commons.UniverseMapper
import com.rickpedia.api.app.universe.application.commons.commands.UniverseCreatorCommand
import com.rickpedia.api.app.universe.domain.Universe
import com.rickpedia.api.app.universe.domain.UniverseRepository
import org.springframework.stereotype.Service

@Service
class UniverseCreator(
        private val universeRepository: UniverseRepository,
        private val universeMapper: UniverseMapper
) {
    fun create(universeCreatorCommand: UniverseCreatorCommand): UniverseDto {
        val universeToCreate = loadUniverseFromCommand(universeCreatorCommand)
        avoidDuplicateUniverses(universeToCreate)
        val savedUniverse = universeRepository.save(universeToCreate)
        return universeMapper.entityToDto(savedUniverse)
    }

    private fun loadUniverseFromCommand(command: UniverseCreatorCommand) =
            Universe(command.name, command.description)

    private fun avoidDuplicateUniverses(universeToCreate: Universe) {
        if (universeExists(universeToCreate))
            throw EntityAllreadyExistsCustomException("Universe", universeToCreate.name)
    }

    private fun universeExists(universe: Universe): Boolean =
            universeRepository.existsByName(universe.name.toUpperCase())
}