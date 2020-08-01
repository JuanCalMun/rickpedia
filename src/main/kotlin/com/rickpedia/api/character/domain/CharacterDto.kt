package com.rickpedia.api.character.domain

import com.rickpedia.api.shared.domain.`object`.BaseDto
import com.rickpedia.api.universe.domain.UniverseDto
import java.time.LocalDate

data class CharacterDto(
        val name: String,
        val universe: UniverseDto,
        val surname: String? = null,
        val nickName: String? = null,
        val birthDate: LocalDate? = null,
        val deathDate: LocalDate? = null,
        val id: Long = 0L) : BaseDto() {

    fun getAge(): String =
            if (deathDate != null && birthDate != null) "${deathDate.year - birthDate.year}"
            else "unknown"

    fun isDead() = deathDate != null
}