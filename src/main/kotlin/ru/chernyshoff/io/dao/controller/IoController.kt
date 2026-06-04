package ru.chernyshoff.io.dao.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ru.chernyshoff.io.service.IoService

@RestController
class IoController(
    private val service: IoService
) {

    @GetMapping
    suspend fun get(): ResponseEntity<String> = service.getAndDelay().let { ResponseEntity.ok(it) }
}