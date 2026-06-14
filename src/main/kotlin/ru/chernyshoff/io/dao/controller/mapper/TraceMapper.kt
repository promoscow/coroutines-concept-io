package ru.chernyshoff.io.dao.controller.mapper

import ru.chernyshoff.io.dao.controller.model.TraceRequest
import ru.chernyshoff.io.dao.controller.model.TraceResponse
import ru.chernyshoff.io.dao.controller.model.type.ServiceTypeDto
import ru.chernyshoff.io.domain.Trace
import ru.chernyshoff.io.domain.type.ServiceType
import java.time.OffsetDateTime

fun TraceRequest.toTrace(): Trace = Trace(
    traceId = this.traceId,
    service = ServiceType.valueOf(this.requestService.name)
)

fun Trace.toResponse(): TraceResponse = TraceResponse(
    traceId = this.traceId,
    timestamp = OffsetDateTime.now(),
    responseService = ServiceTypeDto.valueOf(this.service.name)
)