package com.rickpedia.api.configuration

import com.rickpedia.api.app.character.domain.Character
import com.rickpedia.api.app.character.domain.CharacterRepository
import com.rickpedia.api.app.universe.domain.Universe
import com.rickpedia.api.app.universe.domain.UniverseRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.time.LocalDate

@Configuration
class InitialDatabaseLoad {

    @Bean
    fun dataBaseInitializer(universeRepository: UniverseRepository,
                            characterRepository: CharacterRepository) =
            ApplicationRunner {
                universeRepository.save(Universe(name = "F-512", description = "Pizza"))
                universeRepository.save(Universe(name = "A-35", description = "Reverse"))

                val cowboyUniverse = universeRepository.save(Universe(name = "C-142", description = "Cowboy"))
                characterRepository.save(Character(name = "Morty", surname = "Smith", nickName = "Cowboy Morty", universe = cowboyUniverse))
                characterRepository.save(Character(name = "Beth", surname = "Sanchez", nickName = "Cowboy Beth", universe = cowboyUniverse))
                characterRepository.save(Character(name = "Jerry", surname = "Smith", nickName = "Cowboy Jerry", universe = cowboyUniverse))

                val regularUniverse = universeRepository.save(Universe(name = "C-132", description = "Regular"))
                characterRepository.save(Character(name = "Morty", surname = "Smith",
                        birthDate = LocalDate.now(), universe = regularUniverse))
                characterRepository.save(Character(name = "Beth", surname = "Sanchez",
                        birthDate = LocalDate.now(), universe = regularUniverse))
                characterRepository.save(Character(name = "Jerry", surname = "Smith",
                        birthDate = LocalDate.now(), universe = regularUniverse))
                characterRepository.save(Character(name = "Bird Person", universe = regularUniverse))
                characterRepository.save(Character(name = "Abradolf", surname = "Linkler", universe = regularUniverse))
            }
}