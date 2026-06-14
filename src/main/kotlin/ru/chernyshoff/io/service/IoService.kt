package ru.chernyshoff.io.service

import ru.chernyshoff.io.domain.Trace


interface IoService {

    suspend fun trace(trace: Trace): Trace
}