package com.example.coronanews

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class Menu : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val BotonNoticias = findViewById<Button>(R.id.noticiasMenu)
        val BotonCuidados = findViewById<Button>(R.id.cuidarseEnCasa)
        val BotonVacuna = findViewById<Button>(R.id.comoVacunarte)

        BotonNoticias.setOnClickListener { abrirNoticias() }
        BotonCuidados.setOnClickListener { abrirCuidados() }
        BotonVacuna.setOnClickListener{ abrirVacuna() }

    }

    fun abrirNoticias(){
        val intent_noticias = Intent(this, MainActivity::class.java)
        startActivity(intent_noticias)
    }

    fun abrirCuidados(){
        val intent_noticias_guardadas = Intent(this, Cuidados::class.java)
        startActivity(intent_noticias_guardadas)
    }

    fun abrirVacuna(){
        var url:String = "https://mivacuna.sispro.gov.co/MiVacuna?v1"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}