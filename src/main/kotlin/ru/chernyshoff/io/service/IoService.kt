package ru.chernyshoff.io.service


interface IoService {

    suspend fun getAndDelay(): String
}