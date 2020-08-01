package com.rickpedia.api.shared.domain.exceptions


class EntityNotFound(entityName: String) : CustomException("$entityName not found")