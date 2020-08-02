package com.rickpedia.api.app.universe.application.create

import com.rickpedia.api.app.universe.application.commons.UniverseDto
import com.rickpedia.api.app.universe.application.commons.UniverseMapper
import com.rickpedia.api.app.universe.application.commons.commands.UniverseCreatorCommand
import com.rickpedia.api.app.universe.domain.UniverseRepository
import org.springframework.stereotype.Service

@Service
class UniverseCreator(
        private val universeRepository: UniverseRepository,
        private val universeMapper: UniverseMapper
) {

    fun create(universeCreatorCommand: UniverseCreatorCommand): UniverseDto {
        val universeToCreate = universeMapper.commandToEntity(universeCreatorCommand)
        val savedEntity = universeRepository.save(universeToCreate)
        return universeMapper.entityToDto(savedEntity)
    }
}