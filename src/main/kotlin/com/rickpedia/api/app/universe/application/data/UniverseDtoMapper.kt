package com.rickpedia.api.app.universe.application.data

import com.rickpedia.api.app.commons.application.objects.DtoMapper
import com.rickpedia.api.app.universe.domain.Universe
import org.springframework.stereotype.Component

@Component
class UniverseDtoMapper : DtoMapper<Universe, UniverseDto> {

    override fun entityToDto(entity: Universe) = UniverseDto(
            id = entity.id,
            name = entity.name,
            description = entity.description)

    override fun dtoToEntity(dto: UniverseDto) = Universe(
            id = dto.id,
            name = dto.name,
            description = dto.description)
}