package ru.chernyshoff.io.service.impl

import kotlinx.coroutines.delay
import org.apache.commons.lang3.RandomStringUtils
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import ru.chernyshoff.io.service.IoService

@Service
class IoServiceImpl(
    @Value($$"${app.delay-ms}") private val delayMs: Long,
    @Value($$"${app.service-prefix}") private val servicePrefix: String
) : IoService {

    override suspend fun trace(traceId: String): String =
        "${servicePrefix}.${RandomStringUtils.secure().nextAlphanumeric(6)}"
            .let {
                delay(timeMillis = delayMs)
                "$traceId-$it"
            }
}