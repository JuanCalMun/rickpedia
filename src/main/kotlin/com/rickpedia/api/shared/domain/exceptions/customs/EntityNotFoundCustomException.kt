package com.rickpedia.api.shared.domain.exceptions.customs

import com.rickpedia.api.shared.domain.exceptions.CustomException

class EntityNotFoundCustomException(entityName: String) : CustomException("$entityName not found")