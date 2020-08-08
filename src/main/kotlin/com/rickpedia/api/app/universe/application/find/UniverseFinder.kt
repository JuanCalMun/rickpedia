package com.rickpedia.api.app.universe.application.find

import com.rickpedia.api.app.commons.domain.exceptions.customs.EntityNotFoundCustomException
import com.rickpedia.api.app.universe.application.commons.UniverseDto
import com.rickpedia.api.app.universe.application.commons.UniverseDtoMapper
import com.rickpedia.api.app.universe.domain.UniverseRepository
import org.springframework.stereotype.Service

@Service
class UniverseFinder(
        private val universeRepository: UniverseRepository,
        private val universeDtoMapper: UniverseDtoMapper) {

    fun findByUniverseId(universeId: Long): UniverseDto {
        val foundUniverse = universeRepository.findById(universeId)
        if (foundUniverse.isPresent)
            return universeDtoMapper.entityToDto(foundUniverse.get())
        throw EntityNotFoundCustomException("Universe")
    }

    fun findAll() = universeDtoMapper.entityToDtoList(universeRepository.getAll().toList())
}