package com.rickpedia.api.character.domain

import com.rickpedia.api.universe.domain.Universe
import java.io.Serializable
import java.time.LocalDate
import javax.persistence.*

@Entity
data class Character(
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        val id: Long,

        @Column(nullable = false)
        val name: String,

        val surname: String?,
        val nickName: String?,
        val birthDate: LocalDate?,
        val deathDate: LocalDate?,

        @ManyToOne
        @Column(nullable = false)
        val universe: Universe
) : Serializable
