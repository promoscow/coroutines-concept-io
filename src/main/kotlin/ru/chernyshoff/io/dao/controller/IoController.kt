package ru.chernyshoff.io.dao.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.chernyshoff.io.service.IoService

@RestController
@RequestMapping("/api/io")
class IoController(
    private val service: IoService
) {

    @GetMapping("/task/{taskId}")
    suspend fun get(
        @PathVariable taskId: String
    ): String = service.delayAndContat(taskId)
}