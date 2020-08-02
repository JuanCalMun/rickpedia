package com.rickpedia.api.app.universe.application.provide

import com.rickpedia.api.app.commons.domain.exceptions.customs.EntityNotFoundCustomException
import com.rickpedia.api.app.universe.application.data.UniverseDto
import com.rickpedia.api.app.universe.application.data.UniverseDtoMapper
import com.rickpedia.api.app.universe.domain.UniverseRepository
import org.springframework.stereotype.Service

@Service
class UniverseProvider(
        private val universeRepository: UniverseRepository,
        private val universeDtoMapper: UniverseDtoMapper) {

    fun findByUniverseId(universeId: Long): UniverseDto {
        val foundUniverse = universeRepository.findById(universeId)
        if (foundUniverse.isPresent)
            return universeDtoMapper.entityToDto(foundUniverse.get())
        throw EntityNotFoundCustomException("Universe")
    }

    fun findAll() = universeDtoMapper.entityToDtoList(universeRepository.findAll().toList())
}