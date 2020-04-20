package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.lab3.databinding.ActivityVirusBinding
import kotlinx.android.synthetic.main.activity_virus.*

class Virus : AppCompatActivity() {

    private lateinit var binding: ActivityVirusBinding
    var titulo: String="Coronavirus"
    var subtitulo:String="Informacion general del COVID-19"
    var descripcion = "Los coronavirus son una extensa familia de virus que pueden causar enfermedades leves como el resfriado común, y enfermedades graves. Recientemente el nuevo coronavirus identificado por primera vez en la ciudad china de Wuhan, este nuevo virus altamente contagioso fue nombrado oficialmente como SARS-CoV-2. El coronavirus se puede contagiar si una persona contagiada tose, estornuda o habla y escupe cerca de otra persona. Tambien si se estrechan manos entre dos personas y una de ellas tosio o estornudo en su mano antes. Otro motivo de contagio es mediante las superficies contaminadas, si estas son tocadas y las manos son llevadas posteriormente a la cara."

    private val Usuario: Usuario = Usuario(titulo, subtitulo,descripcion)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_virus)
        //this.setContentView(R.layout.activity_virus)
        binding.usuario = Usuario

        binding.btnHome.setOnClickListener {
            val main = Intent(this, MainActivity::class.java)
            val comentario: String = inputComentario.text.toString()
            main.putExtra("comentario", comentario)
            startActivity(main)
        }
    }

}
