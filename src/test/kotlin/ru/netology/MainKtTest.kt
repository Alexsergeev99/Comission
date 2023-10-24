package ru.netology

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun countComission() {
        val card = "Maestro"
        val lastSum = 10000
        val transfer = 100000

        val result = countComission(card, lastSum, transfer)

        assertEquals(600, result)
    }

    @Test
    fun countComissionWithVisa() {
        val card = "Visa"
        val lastSum = 10000
        val transfer = 100000

        val result = countComission(card, lastSum, transfer)

        assertEquals(750, result)
    }

    @Test
    fun countComissionWithVK() {
        val card = "VK Pay"
        val lastSum = 10000
        val transfer = 10000

        val result = countComission(card, lastSum, transfer)

        assertEquals(0, result)
    }
    @Test
    fun countComissionWithMCZero() {
        val card = "Mastercard"
        val lastSum = 10000
        val transfer = 10000

        val result = countComission(card, lastSum, transfer)

        assertEquals(0, result)
    }

    @Test
    fun countComissionWithWorld35() {
        val card = "Мир"
        val lastSum = 10000
        val transfer = 3000

        val result = countComission(card, lastSum, transfer)

        assertEquals(35, result)
    }
    }
