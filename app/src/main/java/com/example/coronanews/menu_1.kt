package com.example.coronanews

import android.app.Application
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class menu_1 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_1)

        val button_not_guardadas = findViewById<Button>(R.id.noticiasGuardadas)
        val button_noticias = findViewById<Button>(R.id.noticiasMenu)
        val button_cuidados = findViewById<Button>(R.id.cuidarseEnCasa)

        button_not_guardadas.setOnClickListener { abrirNoticiaGuardadas() }
        button_noticias.setOnClickListener { abrirNoticias() }
        button_cuidados.setOnClickListener { abrirCuidados() }

    }

    fun abrirNoticias(){
        val intent_noticias = Intent(this, MainActivity::class.java)
        startActivity(intent_noticias)
    }
    fun abrirNoticiaGuardadas(){
        val intent_noticias_guardadas = Intent(this, noticias_guardadas::class.java)
        startActivity(intent_noticias_guardadas)
    }
    fun abrirCuidados(){
        val intent_noticias_guardadas = Intent(this, Cuidados::class.java)
        startActivity(intent_noticias_guardadas)
    }
}