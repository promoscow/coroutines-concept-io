package ru.chernyshoff.io.service

import io.github.oshai.kotlinlogging.KotlinLogging
import kotlinx.coroutines.delay
import org.apache.commons.lang3.RandomStringUtils
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class IoServiceImpl(
    @Value($$"${app.delay-ms}") private val delayMs: Long
) : IoService {

    private val logger = KotlinLogging.logger { this::class.java }

    override suspend fun delayAndContat(taskId: String): String =
        RandomStringUtils.secure().nextAlphanumeric(6)
            .let { "$taskId-$it" }
            .also {
                delay(timeMillis = delayMs)
                logger.info { "Result: $it" }
            }
}