package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.lab3.databinding.ActivityIndicacionesBinding
import com.example.lab3.databinding.ActivityVirusBinding
import kotlinx.android.synthetic.main.activity_virus.*

class Indicaciones : AppCompatActivity() {

    private lateinit var binding: ActivityIndicacionesBinding
    val titulo: String = "Indicaciones"
    val subtitulo: String = "Como evitar el Coronavirus"
    val descripcion: String = "La forma mas importante para evitar el cotagio es no salr de casa. De esta forma, tampoco se recomienda recibir visitas. Si es necesario salir de casa, se recomienda hacerlo con mascarilla y con guantes desechables o alcohol en gel para mantener las manos limpias."

    private val Usuario: Usuario = Usuario(titulo,subtitulo,descripcion)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_indicaciones)
        binding.usuario = Usuario

        binding.btnHome.setOnClickListener {
            val main = Intent(this, MainActivity::class.java)
            startActivity(main)
        }
    }

}
