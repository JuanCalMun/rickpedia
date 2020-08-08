package com.rickpedia.api.app.universe.application.commons

import com.rickpedia.api.app.universe.domain.Universe
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class UniverseDtoMapperUnitTest {
    private val universeDtoMapper = UniverseDtoMapper()

    @Test
    fun whenHaveCompleteDto_thenAnswerCompleteEntity() {
        val initialUniverseDto = UniverseDto(1L, "name", "description")

        val result = universeDtoMapper.dtoToEntity(initialUniverseDto)

        val expectedResult = Universe("name", "description", 1L)
        Assertions.assertEquals(expectedResult, result)

    }
}