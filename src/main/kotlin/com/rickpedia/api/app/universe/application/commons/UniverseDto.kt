package com.rickpedia.api.app.universe.application.commons

import com.rickpedia.api.app.commons.application.objects.BaseDto

class UniverseDto(
        val id: Long,
        val name: String,
        val description: String
) : BaseDto()
