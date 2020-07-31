package com.rickpedia.api.universe.domain

import com.rickpedia.api.character.domain.Character
import javax.persistence.*

@Entity
class Universe(

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "universe_seq")
        @SequenceGenerator(name = "universe_seq", sequenceName = "UNIVERSE_SEQ", allocationSize = 100)
        val id: Long,
        val name: String,
        val description: String,
        @OneToMany
        val characters: List<Character>
)