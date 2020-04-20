package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.lab3.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val comentario = intent.getStringExtra("comentario");

        if (comentario != null && comentario != "")
            Toast.makeText(applicationContext, comentario, Toast.LENGTH_SHORT).show()

        binding.imgEstrella.setOnClickListener {

            val nombre: String = binding.inputNombre.text.toString()
            val edad: String = binding.inputEdad.text.toString()

            var mensaje: String = if (edad.toInt() in 0..40) {
                "$nombre, tu riesgo de morir por coronavirus es casi nulo. No salgas por el bien de la sociedad."
            } else if (edad.toInt() in 41..60) {
                "$nombre, tu riesgo de morir por coronavirus está entre 0.4% y 1.3%. No salgas por el bien de la sociedad.";
            } else if (edad.toInt() in 61..120) {
                "$nombre, por tu edad estás muy expuesto al salir de casa. Por favor quédate en ella."
            } else {
                "$nombre, ingresa una edad razonable."
            }
            binding.txtMensaje.text = mensaje
            if (txtMensaje.visibility == View.GONE) {
                binding.inputEdad.visibility = View.GONE
                binding.inputNombre.visibility = View.GONE
                binding.txtMensaje.visibility = View.VISIBLE
            } else {
                binding.inputEdad.visibility = View.VISIBLE
                binding.inputNombre.visibility = View.VISIBLE
                binding.txtMensaje.visibility = View.GONE

            }
        }


        binding.btnVirus.setOnClickListener {
            startActivity(Intent(this, Virus::class.java))
        }
        binding.btnIndicaciones.setOnClickListener {
            startActivity(Intent(this, Indicaciones::class.java))
        }
        binding.btnSintomas.setOnClickListener {
            startActivity(Intent(this, Sintomas::class.java))
        }


//        binding.btnIndicaciones.setOnClickListener{
//            val indicacionesTab = Intent(this, Data::class.java)
//            val titulo: String = "Indicaciones"
//            val subtitulo: String = "Como evitar el Coronavirus"
//            val descripcion: String = "La forma mas importante para evitar el cotagio es no salr de casa. De esta forma, tampoco se recomienda recibir visitas. Si es necesario salir de casa, se recomienda hacerlo con mascarilla y con guantes desechables o alcohol en gel para mantener las manos limpias."
//
//            indicacionesTab.putExtra("titulo", titulo)
//            indicacionesTab.putExtra("subtitulo", subtitulo)
//            indicacionesTab.putExtra("descripcion", descripcion)
//            startActivity(indicacionesTab)
//        }
//
//        binding.btnSintomas.setOnClickListener{
//            val sintomasTab = Intent(this, Data::class.java)
//            val titulo: String = "Sintomas"
//            val subtitulo: String = "Que presentan los ciudadanos contagiados?"
//            val descripcion: String = "Los sintomas que las personas contagiadas con Coronavirus presentan son: Fiebre Alta (38C o mas), tos seca, perdida del sentido del olfato y del gusto, falta de apetito, dolores musculares y fatiga."
//
//            sintomasTab.putExtra("titulo", titulo)
//            sintomasTab.putExtra("subtitulo", subtitulo)
//            sintomasTab.putExtra("descripcion", descripcion)
//            startActivity(sintomasTab)
//        }

    }
}
