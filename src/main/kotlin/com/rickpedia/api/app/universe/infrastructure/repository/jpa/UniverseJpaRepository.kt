package com.rickpedia.api.app.universe.infrastructure.repository.jpa

import com.rickpedia.api.app.universe.domain.Universe
import org.springframework.data.jpa.repository.JpaRepository

interface UniverseJpaRepository : JpaRepository<Universe, Long> {
    fun existsUniverseByName(name: String): Boolean

}