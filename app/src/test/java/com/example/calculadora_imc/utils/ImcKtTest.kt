package com.example.calculadora_imc.utils

import org.junit.Assert.*
import org.junit.Test

// Classe de teste do método de calculo do IMC
class ImcKtTest {

    // Testando o valor de SOBREPESO, passando os valores válidos
    @Test
    fun testGetImcResult_90_180_sobrepeso() {
        val result = getImcResult("90", "1.80")
        assertEquals(result.result, Result.SOBREPESO)
    }

    // Testando o valor faltando uma informação, assim exibindo o resultado em BRANCO
    @Test
    fun testGetImcResult_sem_altura() {
        val result = getImcResult("90", "")
        assertEquals(result.result, Result.BLANK)
    }
    // Testando o valor faltando outra informação, assim exibindo o resultado em BRANCO
    @Test
    fun testGetImcResult__sem_peso() {
        val result = getImcResult("", "1.80")
        assertEquals(result.result, Result.BLANK)
    }
}