package com.rickpedia.api.character.domain

import com.rickpedia.api.universe.domain.Universe
import java.io.Serializable
import java.time.LocalDate
import javax.persistence.*

@Entity
class Character(
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "character_seq")
        @SequenceGenerator(name = "character_seq", sequenceName = "CHARACTER_SEQ", allocationSize = 100)
        var id: Long,

        @Column(nullable = false)
        var name: String,

        var surname: String?,
        var nickName: String?,
        var birthDate: LocalDate?,
        var deathDate: LocalDate?,

        @ManyToOne
        var universe: Universe
) : Serializable
