package com.example.calculadora_imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import com.example.calculadora_imc.utils.getImcResult

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Definindo a tela principal
        setContentView(R.layout.activity_main)

        // Ação do botão criado
        btn_make_calc.setOnClickListener {
            // Capturando o dado de peso do usuário
            val pesoTxt = edt_peso.text.toString()
            // Capturando o dado de altura do usuário
            val alturaTxt = edt_altura.text.toString()

            // Com os dados capturados, vamos executar o método de calcular o IMC do usuário
            val imcResult = getImcResult(pesoTxt, alturaTxt)

            // Vamos exibir o resultado final do cálculo no label criado dentro da tela
            txt_result_imc.text = imcResult.result.label
        }
    }
}