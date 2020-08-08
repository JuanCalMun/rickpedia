package com.rickpedia.api.app.commons.infrastructure

import com.rickpedia.api.app.commons.domain.exceptions.customs.EntityNotFoundCustomException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler

@ControllerAdvice
class CustomExceptionHandler : ResponseEntityExceptionHandler() {

    @ExceptionHandler(EntityNotFoundCustomException::class)
    fun entityNotFoundHandler(exception: Exception, request: WebRequest): ResponseEntity<String> {
        val errorText = "Request end. ${exception.message}"
        logger.warn("EntityNotFoundException: $errorText")
        return ResponseEntity(errorText, HttpStatus.OK)
    }
}
