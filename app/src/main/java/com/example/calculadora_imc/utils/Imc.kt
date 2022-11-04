package com.example.calculadora_imc.utils

// Método responsável pelo calculo do IMC
internal fun getImcResult(pesoTxt: String, alturaTxt: String): IMCResult {

    // Caso identifiquemos que o usuário mandou um ou mais valores vazio,
    // não será possível efetuar o calco e devemos retornar uma mensagem customizada
    if(pesoTxt.isEmpty() || alturaTxt.isEmpty()) {
        return IMCResult(Result.BLANK)
    }

    // Transformando os dados recebidos pelo usuário em FLOAT, assim podendo
    // efetuar o calculo corretamente
    val peso = pesoTxt.toFloat()
    val altura = alturaTxt.toFloat()

    // Vamos pegar o peso e dividir pela altura ao quadrado, com isso teremos o IMC
    val imc = peso / (altura * altura)

    // Switch de testes para exibir qual o valor do IMC do usuário na tela
    if (imc < 16) {
        return IMCResult(Result.MAGREZA_III)
    } else if (imc < 17) {
        return IMCResult(Result.MAGREZA_II)
    } else if (imc < 18.5) {
        return IMCResult(Result.MAGREZA_I)
    } else if (imc < 25) {
        return IMCResult(Result.OK)
    } else if (imc < 30) {
        return IMCResult(Result.SOBREPESO)
    } else if (imc < 35) {
        return IMCResult(Result.OBESIDADE_I)
    } else if (imc < 40) {
        return IMCResult(Result.OBESIDADE_II)
    } else {
        return IMCResult(Result.OBESIDADE_III)
    }
}

// Uma class de DADOS para transitar informações de forma segura e TIPADA
data class IMCResult(val result: Result)

// Switch de opções em forma de texto para representar os IMCs para o usuário
enum class Result(val label: String) {
    MAGREZA_III("Magreza Severa"),
    MAGREZA_II("Magreza moderada"),
    MAGREZA_I("Magreza leve"),
    OK("Saudável"),
    SOBREPESO("Sobrepeso"),
    OBESIDADE_I("Obesidade Grau I"),
    OBESIDADE_II("Obesidade Grau II (severa)"),
    OBESIDADE_III("Obesidade Grau III (mórbida)"),
    BLANK("Insira os valores de peso e altura corretamente")
}
