package com.rickpedia.api.app.universe.application.create

import com.rickpedia.api.app.universe.application.data.UniverseDto
import com.rickpedia.api.app.universe.application.data.UniverseDtoMapper
import com.rickpedia.api.app.universe.domain.UniverseRepository
import org.springframework.stereotype.Service

@Service
class UniverseCreator(
        private val universeRepository: UniverseRepository,
        private val universeCreatorCommandMapper: UniverseCreatorCommandMapper,
        private val universeDtoMapper: UniverseDtoMapper
) {

    fun create(universeCreatorCommand: UniverseCreatorCommand): UniverseDto {
        val universeToCreate = universeCreatorCommandMapper.commandToEntity(universeCreatorCommand)
        val savedEntity = universeRepository.save(universeToCreate)
        return universeDtoMapper.entityToDto(savedEntity)
    }
}