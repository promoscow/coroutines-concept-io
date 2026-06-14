package ru.chernyshoff.io.dao.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.chernyshoff.io.dao.controller.mapper.toResponse
import ru.chernyshoff.io.dao.controller.mapper.toTrace
import ru.chernyshoff.io.dao.controller.model.TraceRequest
import ru.chernyshoff.io.dao.controller.model.TraceResponse
import ru.chernyshoff.io.service.IoService

@RestController
@RequestMapping("/api/io")
class IoController(
    private val service: IoService
) {

    @PostMapping("/trace")
    suspend fun trace(@RequestBody request: TraceRequest): TraceResponse =
        request.toTrace().let { service.trace(it) }.toResponse()
}