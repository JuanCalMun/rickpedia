package com.rickpedia.api.character.domain

import com.rickpedia.api.universe.domain.Universe
import java.io.Serializable
import java.time.LocalDate
import javax.persistence.*

@Entity
class Character(

        @Column(nullable = false)
        var name: String,

        @ManyToOne
        var universe: Universe,

        var surname: String? = null,
        var nickName: String? = null,
        var birthDate: LocalDate? = null,
        var deathDate: LocalDate? = null,
        
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "character_seq")
        @SequenceGenerator(name = "character_seq", sequenceName = "CHARACTER_SEQ", allocationSize = 100)
        var id: Long = 0L
) : Serializable
