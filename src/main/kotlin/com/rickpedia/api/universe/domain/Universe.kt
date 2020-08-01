package com.rickpedia.api.universe.domain

import java.io.Serializable
import javax.persistence.*

@Entity
class Universe(

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "universe_seq")
        @SequenceGenerator(name = "universe_seq", sequenceName = "UNIVERSE_SEQ", allocationSize = 100)
        var id: Long,

        var name: String,
        var description: String

//        TODO check viability of put relation here
//        @OneToMany
//        var characters: MutableList<Character>
) : Serializable