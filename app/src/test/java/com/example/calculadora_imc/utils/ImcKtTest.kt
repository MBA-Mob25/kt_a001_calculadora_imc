package com.example.calculadora_imc.utils

import org.junit.Assert.*
import org.junit.Test

class ImcKtTest {

    @Test
    fun testGetImcResult_90_180_sobrepeso() {
        val result = getImcResult("90", "1.80")
        assertEquals(result.result, Result.SOBREPESO)
    }

    @Test
    fun testGetImcResult_sem_altura() {
        val result = getImcResult("90", "")
        assertEquals(result.result, Result.BLANK)
    }

    @Test
    fun testGetImcResult__sem_peso() {
        val result = getImcResult("", "1.80")
        assertEquals(result.result, Result.BLANK)
    }
}