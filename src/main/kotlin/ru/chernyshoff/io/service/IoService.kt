package ru.chernyshoff.io.service


interface IoService {

    suspend fun delayAndContat(taskId: String): String
}