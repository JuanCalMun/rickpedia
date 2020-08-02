package com.rickpedia.api.app.character.application.data

import com.rickpedia.api.app.commons.application.objects.BaseDto
import com.rickpedia.api.app.universe.application.data.UniverseDto
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