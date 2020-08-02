package com.rickpedia.api.app.universe.application.provide

import com.rickpedia.api.app.commons.domain.exceptions.customs.EntityNotFoundCustomException
import com.rickpedia.api.app.universe.application.commons.UniverseDto
import com.rickpedia.api.app.universe.application.commons.UniverseMapper
import com.rickpedia.api.app.universe.domain.UniverseRepository
import org.springframework.stereotype.Service

@Service
class UniverseProvider(
        private val universeRepository: UniverseRepository,
        private val universeMapper: UniverseMapper) {

    fun findByUniverseId(universeId: Long): UniverseDto {
        val foundUniverse = universeRepository.findById(universeId)
        if (foundUniverse.isPresent)
            return universeMapper.entityToDto(foundUniverse.get())
        throw EntityNotFoundCustomException("Universe")
    }

    fun findAll() = universeMapper.entityToDtoList(universeRepository.findAll().toList())
}