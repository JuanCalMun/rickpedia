package com.rickpedia.api.character.domain

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CharacterRepository : CrudRepository<Character, Long>