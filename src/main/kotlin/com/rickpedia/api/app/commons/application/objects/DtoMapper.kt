package com.rickpedia.api.app.commons.application.objects

interface DtoMapper<E, D : BaseDto> {
    fun entityToDto(entity: E): D
    fun dtoToEntity(dto: D): E

    fun entityToDtoList(entityList: List<E>) =
            entityList.map { this.entityToDto(it) }

    fun dtoToEntityList(dtoList: List<D>) =
            dtoList.map { this.dtoToEntity(it) }
}