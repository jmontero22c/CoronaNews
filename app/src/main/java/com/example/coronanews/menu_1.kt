package com.example.coronanews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class menu_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_1)

        val button_not_guardadas = findViewById<Button>(R.id.noticiasGuardadas)
        val button_noticias = findViewById<Button>(R.id.noticiasMenu)

        button_not_guardadas.setOnClickListener { abrirNoticiaGuardadas() }
        button_noticias.setOnClickListener { abrirNoticias() }
    }

    fun abrirNoticias(){
        val intent_noticias = Intent(this, MainActivity::class.java)
        startActivity(intent_noticias)
    }
    fun abrirNoticiaGuardadas(){
        val intent_noticias_guardadas = Intent(this, noticias_guardadas::class.java)
        startActivity(intent_noticias_guardadas)
    }
}