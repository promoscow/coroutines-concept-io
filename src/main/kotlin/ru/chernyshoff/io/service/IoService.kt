package ru.chernyshoff.io.service


interface IoService {

    suspend fun trace(traceId: String): String
}