package com.rickpedia.api.character.domain

import com.rickpedia.api.shared.domain.`object`.ObjectMapper
import com.rickpedia.api.universe.domain.UniverseMapper
import org.springframework.stereotype.Component

@Component
class CharacterMapper(private val universeMapper: UniverseMapper)
    : ObjectMapper<Character, CharacterDto> {

    override fun entityToDto(entity: Character) = CharacterDto(
            id = entity.id,
            name = entity.name,
            surname = entity.surname,
            nickName = entity.nickName,
            birthDate = entity.birthDate,
            deathDate = entity.deathDate,
            universe = universeMapper.entityToDto(entity.universe)
    )

    override fun dtoToEntity(dto: CharacterDto) = Character(
            id = dto.id,
            name = dto.name,
            surname = dto.surname,
            nickName = dto.nickName,
            birthDate = dto.birthDate,
            deathDate = dto.deathDate,
            universe = universeMapper.dtoToEntity(dto.universe)
    )
}