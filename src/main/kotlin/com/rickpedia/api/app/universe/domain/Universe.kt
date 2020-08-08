package com.rickpedia.api.app.universe.domain

import java.io.Serializable
import javax.persistence.*

@Entity
data class Universe(
        var name: String,
        var description: String,

        @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "universe_seq")
        @SequenceGenerator(name = "universe_seq", sequenceName = "UNIVERSE_SEQ", allocationSize = 100)
        var id: Long = 0L
) : Serializable