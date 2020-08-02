package com.rickpedia.api.app.commons.application.commands

import java.time.LocalDateTime

abstract class BaseCommand(val commandCreatedDate: LocalDateTime = LocalDateTime.now())
