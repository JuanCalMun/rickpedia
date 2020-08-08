package com.rickpedia.api.app.character.infrastructure.rest.v1

import com.rickpedia.api.app.character.application.CharacterProvider
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/character")
class InfrastructureRestController(
        private val characterProvider: CharacterProvider) {
    @GetMapping
    fun getAllCharacters() = characterProvider.findAll()

    @GetMapping("/{characterId}")
    fun getOneCharacterById(@PathVariable characterId: Long) =
            characterProvider.findByCharacterId(characterId)

}