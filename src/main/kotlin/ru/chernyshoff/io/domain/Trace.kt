package ru.chernyshoff.io.domain

import ru.chernyshoff.io.domain.type.ServiceType

data class Trace(
    val traceId: String,
    val service: ServiceType
)
