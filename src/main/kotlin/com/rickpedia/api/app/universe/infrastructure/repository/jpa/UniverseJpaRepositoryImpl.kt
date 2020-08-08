package com.rickpedia.api.app.universe.infrastructure.repository.jpa

import com.rickpedia.api.app.universe.domain.Universe
import com.rickpedia.api.app.universe.domain.UniverseRepository
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Repository

@Primary
@Repository
class UniverseJpaRepositoryImpl(
        private val universeJpaRepository: UniverseJpaRepository
) : UniverseRepository {
    override fun getAll(): MutableIterable<Universe> = universeJpaRepository.findAll()

    override fun save(universe: Universe) = universeJpaRepository.save(universe)

    override fun findById(universeId: Long) = universeJpaRepository.findById(universeId)

    override fun existsByName(name: String) = universeJpaRepository.existsUniverseByName(name)

}