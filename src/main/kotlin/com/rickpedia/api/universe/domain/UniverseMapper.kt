package com.rickpedia.api.universe.domain

import com.rickpedia.api.shared.domain.`object`.ObjectMapper
import org.springframework.stereotype.Component

@Component
class UniverseMapper : ObjectMapper<Universe, UniverseDto> {

    override fun entityToDto(entity: Universe) = UniverseDto(
            id = entity.id,
            name = entity.name,
            description = entity.description)

    override fun dtoToEntity(dto: UniverseDto) = Universe(
            id = dto.id,
            name = dto.name,
            description = dto.description)
}