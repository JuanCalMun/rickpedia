package com.rickpedia.api.universe.domain

import com.rickpedia.api.shared.domain.BaseDto

class UniverseDto(
        val id: Long,
        val name: String,
        val description: String
) : BaseDto()
