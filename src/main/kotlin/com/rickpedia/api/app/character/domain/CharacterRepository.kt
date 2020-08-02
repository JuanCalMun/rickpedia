package com.rickpedia.api.app.character.domain

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CharacterRepository : CrudRepository<Character, Long>