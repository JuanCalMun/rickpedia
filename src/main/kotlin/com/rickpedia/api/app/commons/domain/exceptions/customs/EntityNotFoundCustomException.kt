package com.rickpedia.api.app.commons.domain.exceptions.customs

import com.rickpedia.api.app.commons.domain.exceptions.CustomException

class EntityNotFoundCustomException(entityName: String) : CustomException("$entityName not found")