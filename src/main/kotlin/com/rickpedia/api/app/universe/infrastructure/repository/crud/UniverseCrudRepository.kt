package com.rickpedia.api.app.universe.infrastructure.repository.crud

import com.rickpedia.api.app.universe.domain.Universe
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UniverseCrudRepository : CrudRepository<Universe, Long> {
    fun existsByName(name: String): Boolean

}