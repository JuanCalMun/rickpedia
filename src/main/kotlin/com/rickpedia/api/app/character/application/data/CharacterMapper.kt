package com.rickpedia.api.app.character.application.data

import com.rickpedia.api.app.character.domain.Character
import com.rickpedia.api.app.commons.application.objects.DtoMapper
import com.rickpedia.api.app.universe.application.commons.UniverseDtoMapper
import org.springframework.stereotype.Component

@Component
class CharacterMapper(private val universeDtoMapper: UniverseDtoMapper)
    : DtoMapper<Character, CharacterDto> {

    override fun entityToDto(entity: Character) = CharacterDto(
            id = entity.id,
            name = entity.name,
            surname = entity.surname,
            nickName = entity.nickName,
            birthDate = entity.birthDate,
            deathDate = entity.deathDate,
            universe = universeDtoMapper.entityToDto(entity.universe)
    )

    override fun dtoToEntity(dto: CharacterDto) = Character(
            id = dto.id,
            name = dto.name,
            surname = dto.surname,
            nickName = dto.nickName,
            birthDate = dto.birthDate,
            deathDate = dto.deathDate,
            universe = universeDtoMapper.dtoToEntity(dto.universe)
    )
}