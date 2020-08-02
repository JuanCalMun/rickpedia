package com.rickpedia.api.app.universe.domain

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UniverseRepository : CrudRepository<Universe, Long>