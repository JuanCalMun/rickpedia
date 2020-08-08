package com.rickpedia.api.app.universe.application.find

import com.rickpedia.api.app.commons.application.commands.BaseCommand

data class UniverseFinderCommand(
        val id: Long? = null,
        val name: String? = null,
        val description: String? = null
) : BaseCommand()