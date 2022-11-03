package com.example.calculadora_imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_make_calc.setOnClickListener {
            val pesoTxt = edt_peso.text.toString()
            val alturaTxt = edt_altura.text.toString()
            val peso = pesoTxt.toFloat()
            val altura = alturaTxt.toFloat()
            val imc = peso / (altura * altura)
            if (imc < 16) {
                txt_result_imc.text = "Magreza grave"
            } else if (imc < 17) {
                txt_result_imc.text = "Magreza moderada"
            } else if (imc < 18.5) {
                txt_result_imc.text = "Magreza leve"
            } else if (imc < 25) {
                txt_result_imc.text = "Saudável"
            } else if (imc < 30) {
                txt_result_imc.text = "Sobrepeso"
            } else if (imc < 35) {
                txt_result_imc.text = "Obesidade Grau I"
            } else if (imc < 40) {
                txt_result_imc.text = "Obesidade Grau II (severa)"
            } else {
                txt_result_imc.text = "Obesidade Grau III (mórbida)"
            }
        }
    }
}