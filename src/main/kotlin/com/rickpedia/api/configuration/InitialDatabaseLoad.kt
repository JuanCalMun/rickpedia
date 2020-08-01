package com.rickpedia.api.configuration

import com.rickpedia.api.character.domain.Character
import com.rickpedia.api.character.domain.CharacterRepository
import com.rickpedia.api.universe.domain.Universe
import com.rickpedia.api.universe.domain.UniverseRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class InitialDatabaseLoad {

    @Bean
    fun dataBaseInitializer(universeRepository: UniverseRepository,
                            characterRepository: CharacterRepository) =
            ApplicationRunner {
                universeRepository.save(Universe(name = "C-142", description = "Cowboy"))
                universeRepository.save(Universe(name = "C-132", description = "Regular"))
                universeRepository.save(Universe(name = "A-35", description = "Reverse"))
                val cowboyUniverse =
                        universeRepository.save(Universe(name = "F-512", description = "Pizza"))
                characterRepository.save(Character(name = "Morty", nickName = "Cowboy Morty", universe = cowboyUniverse))
                characterRepository.save(Character(name = "Beth", nickName = "Cowboy Beth", universe = cowboyUniverse))
                characterRepository.save(Character(name = "Jerry", nickName = "Cowboy Jerry", universe = cowboyUniverse))
            }
}