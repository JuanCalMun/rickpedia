package com.rickpedia.api.universe.infrastructure.rest.v1

import com.rickpedia.api.universe.application.UniverseProvider
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/universe")
class UniverseRestController(private val universeProvider: UniverseProvider) {

    @GetMapping
    fun getAllUniverses() = universeProvider.findAll()

    @GetMapping("/{universeId}")
    fun getOneUniverseById(@PathVariable universeId: Long) =
            universeProvider.findByUniverseId(universeId)

}