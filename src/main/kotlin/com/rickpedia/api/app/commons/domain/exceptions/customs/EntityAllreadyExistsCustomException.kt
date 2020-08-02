package com.rickpedia.api.app.commons.domain.exceptions.customs

import com.rickpedia.api.app.commons.domain.exceptions.CustomException

class EntityAllreadyExistsCustomException(
        entityName: String,
        entityIdValue: String
) : CustomException("Allready exists the $entityName: $entityIdValue")