package com.rickpedia.api.character.domain

import com.rickpedia.api.shared.domain.BaseDto
import com.rickpedia.api.universe.domain.UniverseDto
import java.time.LocalDate

data class CharacterDto(
        val id: Long,
        val name: String,
        val surname: String?,
        val nickName: String?,
        val birthDate: LocalDate?,
        val deathDate: LocalDate?,
        val universe: UniverseDto) : BaseDto() {

    fun getAge(): String =
            if (deathDate != null && birthDate != null) "${deathDate.year - birthDate.year}"
            else "unknown"

    fun isDead() = deathDate != null
}