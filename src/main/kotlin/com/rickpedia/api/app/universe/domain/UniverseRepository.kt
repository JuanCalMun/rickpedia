package com.rickpedia.api.app.universe.domain

import java.util.*

interface UniverseRepository {
    fun getAll(): MutableIterable<Universe>
    fun save(universe: Universe): Universe
    fun findById(universeId: Long): Optional<Universe>
    fun existsByName(name: String): Boolean
}