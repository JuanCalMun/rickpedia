package com.rickpedia.api.app.universe.infrastructure.rest.v1

import com.rickpedia.api.app.universe.application.create.UniverseCreator
import com.rickpedia.api.app.universe.application.create.UniverseCreatorCommand
import com.rickpedia.api.app.universe.application.find.UniverseFinder
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/universe")
class UniverseRestController(
        private val universeFinder: UniverseFinder,
        private val universeCreator: UniverseCreator) {

    @GetMapping
    fun getAllUniverses() = universeFinder.findAll()

    @GetMapping("/{universeId}")
    fun getOneUniverseById(@PathVariable universeId: Long) =
            universeFinder.findByUniverseId(universeId)

    @PostMapping
    fun createUniverse(@RequestBody universeToCreate: UniverseCreatorCommand) =
            universeCreator.create(universeToCreate)
}