package com.rickpedia.api.universe.application

import com.rickpedia.api.universe.domain.UniverseMapper
import com.rickpedia.api.universe.domain.UniverseRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UniverseProvider @Autowired constructor(
        private val universeRepository: UniverseRepository,
        private val universeMapper: UniverseMapper) {

    fun findByUniverseId(universeId: Long) =
            universeMapper.entityToDto(
                    universeRepository.findById(universeId).orElse(null))

    fun findAll() = universeMapper.entityToDtoList(universeRepository.findAll())
}