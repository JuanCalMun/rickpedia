package com.rickpedia.api.universe.domain

import com.rickpedia.api.character.domain.CharacterDto
import com.rickpedia.api.shared.domain.BaseDto

class UniverseDto(
        val id: Long,
        val name: String,
        val description: String,
        val characters: List<CharacterDto>
) : BaseDto()
