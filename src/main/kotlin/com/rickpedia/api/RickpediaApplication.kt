package com.rickpedia.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RickpediaApplication

fun main(args: Array<String>) {
	runApplication<RickpediaApplication>(*args)
}
