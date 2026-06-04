package ru.chernyshoff.io.dao.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.chernyshoff.io.service.IoService

@RestController
@RequestMapping("/api/io")
class IoController(
    private val service: IoService
) {

    @GetMapping
    suspend fun get(): String = service.getAndDelay()
}