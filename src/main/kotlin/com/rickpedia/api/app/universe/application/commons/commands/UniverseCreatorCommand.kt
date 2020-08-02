package com.rickpedia.api.app.universe.application.commons.commands

import com.rickpedia.api.app.commons.application.commands.BaseCommand

data class UniverseCreatorCommand(
        val name: String,
        val description: String
) : BaseCommand()