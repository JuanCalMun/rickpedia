package com.rickpedia.api.app.character.application

import com.rickpedia.api.app.character.application.data.CharacterDto
import com.rickpedia.api.app.character.application.data.CharacterMapper
import com.rickpedia.api.app.character.domain.CharacterRepository
import com.rickpedia.api.app.commons.domain.exceptions.customs.EntityNotFoundCustomException
import org.springframework.stereotype.Service

@Service
class CharacterProvider(
        private val characterRepository: CharacterRepository,
        private val characterMapper: CharacterMapper) {

    fun findByCharacterId(characterId: Long): CharacterDto {
        val foundCharacter = characterRepository.findById(characterId)
        if (foundCharacter.isPresent)
            return characterMapper.entityToDto(foundCharacter.get())
        throw EntityNotFoundCustomException("Character")
    }

    fun findAll() = characterMapper.entityToDtoList(characterRepository.findAll().toList())
}