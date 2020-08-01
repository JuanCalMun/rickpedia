package com.rickpedia.api.character.application

import com.rickpedia.api.character.domain.CharacterDto
import com.rickpedia.api.character.domain.CharacterMapper
import com.rickpedia.api.character.domain.CharacterRepository
import com.rickpedia.api.shared.domain.exceptions.customs.EntityNotFoundCustomException
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