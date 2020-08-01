package com.rickpedia.api.universe.domain

import com.rickpedia.api.character.domain.CharacterMapper
import com.rickpedia.api.shared.domain.ObjectMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class UniverseMapper : ObjectMapper<Universe, UniverseDto> {

    @Autowired
    private lateinit var characterMapper: CharacterMapper

    override fun entityToDto(entity: Universe) = UniverseDto(
            id = entity.id,
            name = entity.name,
            description = entity.description,
            characters = characterMapper.entityToDtoList(entity.characters)
    )
    
    override fun dtoToEntity(dto: UniverseDto) = Universe(
            id = dto.id,
            name = dto.name,
            description = dto.description,
            characters = characterMapper.dtoToEntityList(dto.characters)
    )
}