package com.rickpedia.api.app.universe.infrastructure.rest.v1

import com.rickpedia.api.app.universe.application.commons.commands.UniverseCreatorCommand
import com.rickpedia.api.app.universe.application.create.UniverseCreator
import com.rickpedia.api.app.universe.application.provide.UniverseProvider
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/universe")
class UniverseRestController(
        private val universeProvider: UniverseProvider,
        private val universeCreator: UniverseCreator) {

    @GetMapping
    fun getAllUniverses() = universeProvider.findAll()

    @GetMapping("/{universeId}")
    fun getOneUniverseById(@PathVariable universeId: Long) =
            universeProvider.findByUniverseId(universeId)

    @PostMapping
    fun createUniverse(@RequestBody universeToCreate: UniverseCreatorCommand) =
            universeCreator.create(universeToCreate)
}