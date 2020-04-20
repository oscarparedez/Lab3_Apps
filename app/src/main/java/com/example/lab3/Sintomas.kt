package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.lab3.databinding.ActivityIndicacionesBinding
import com.example.lab3.databinding.ActivitySintomasBinding

class Sintomas : AppCompatActivity() {

    private lateinit var binding: ActivitySintomasBinding
    val titulo: String = "Sintomas"
    val subtitulo: String = "Que presentan los ciudadanos contagiados?"
    val descripcion: String = "Los sintomas que las personas contagiadas con Coronavirus presentan son: Fiebre Alta (38C o mas), tos seca, perdida del sentido del olfato y del gusto, falta de apetito, dolores musculares y fatiga."

    private val Usuario: Usuario = Usuario(titulo,subtitulo,descripcion)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sintomas)

        binding.usuario = Usuario

        binding.btnHome.setOnClickListener {
            val main = Intent(this, MainActivity::class.java)
            startActivity(main)
        }
    }
}
