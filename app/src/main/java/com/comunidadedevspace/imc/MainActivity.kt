package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Recuperar os componentes EditText
        // Criar uma variável e associar (=) o componente de UI <EditText>
        // Recuperar o botão da tela
        // Colocar ação no botão
        // Recuperar o texto digitado no Peso

        val edtpeso = findViewById<TextInputEditText>(R.id.idttext_peso)
        val edtaltura = findViewById<TextInputEditText>(R.id.idttext_altura)
        val btnCalcular = findViewById<Button>(R.id.btn_calcular)


        btnCalcular.setOnClickListener {
            val peso = edtpeso.text
            val altura = edtaltura.text
            println(" / peso")


        }

    }
}