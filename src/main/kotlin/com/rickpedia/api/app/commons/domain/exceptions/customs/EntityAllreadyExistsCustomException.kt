package com.rickpedia.api.app.commons.domain.exceptions.customs

import com.rickpedia.api.app.commons.domain.exceptions.CustomException
import com.rickpedia.api.app.commons.domain.exceptions.EntityEnum

class EntityAllreadyExistsCustomException(
        entity: EntityEnum
) : CustomException("The ${entity.name} allready exists")