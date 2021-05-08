package com.example.coronanews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class noticias_guardadas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_noticias_guardadas)


        val buttonMenu = findViewById<ImageButton>(R.id.button)
        buttonMenu.setOnClickListener { abrirMenu() }



    }
    fun abrirMenu(){
        val openIntent = Intent(this, menu_1::class.java)
        startActivity(openIntent)
    }


}