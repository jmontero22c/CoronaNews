package com.example.coronanews

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.ablanco.zoomy.Zoomy


class Cuidados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuidados)

        val cuidarse1 = findViewById<ImageView>(R.id.cuidado1)
        val cuidarse2 = findViewById<ImageView>(R.id.cuidado2)
        val cuidarse3 = findViewById<ImageView>(R.id.cuidado3)
        val cuidarse4 = findViewById<ImageView>(R.id.cuidado4)
        val cuidarse5 = findViewById<ImageView>(R.id.cuidado5)
        val cuidarse6 = findViewById<ImageView>(R.id.cuidado6)
        val cuidarse7 = findViewById<ImageView>(R.id.cuidado7)

        val builder1 = Zoomy.Builder(this).target(cuidarse1)
        val builder2 = Zoomy.Builder(this).target(cuidarse2)
        val builder3 = Zoomy.Builder(this).target(cuidarse3)
        val builder7 = Zoomy.Builder(this).target(cuidarse7)
        val builder4 = Zoomy.Builder(this).target(cuidarse4)
        val builder5 = Zoomy.Builder(this).target(cuidarse5)
        val builder6 = Zoomy.Builder(this).target(cuidarse6)

        builder1.register()
        builder2.register()
        builder3.register()
        builder4.register()
        builder5.register()
        builder6.register()
        builder7.register()


    }
}