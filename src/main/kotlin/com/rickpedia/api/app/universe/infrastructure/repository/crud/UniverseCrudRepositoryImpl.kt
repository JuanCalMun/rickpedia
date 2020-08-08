package com.rickpedia.api.app.universe.infrastructure.repository.crud

import com.rickpedia.api.app.universe.domain.Universe
import com.rickpedia.api.app.universe.domain.UniverseRepository
import org.springframework.stereotype.Repository

@Repository
class UniverseCrudRepositoryImpl(
        private val universeCrudRepository: UniverseCrudRepository
) : UniverseRepository {
    override fun getAll() = universeCrudRepository.findAll()

    override fun save(universe: Universe) =
            universeCrudRepository.save(universe)

    override fun findById(universeId: Long) =
            universeCrudRepository.findById(universeId)

    override fun existsByName(name: String) =
            universeCrudRepository.existsByName(name)
}