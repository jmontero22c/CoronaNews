package com.example.coronanews

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val noticias_list =findViewById<ListView>(R.id.noticias)
        val noticias = arrayListOf<noticias>(
                noticias("El aislamiento de Brasil en la lucha contra el Covid-19", "n_1"),
                noticias("Los países con más mortalidad por covid-19 en América", "n_2"),
                noticias("Pacientes que tomaron antihipertensivos tienen menor riesgo de hospitalización o muerte por covid-19, según estudio", "n_3"),
                noticias("Estos son los animales en los que OMS busca el origen del covid", "n_4"),
                noticias("Alemania planea ampliar la producción de vacunas contra COVID-19", "n_5"),
                noticias("La OMS recomienda usar ivermectina para el COVID-19 solo en ensayos clínicos", "n_6"),
                noticias("Brasil detecta una nueva variante del covid-19 similar a la detectada en sudafricana", "n_7")
        )

        val myadapter =noticiasAdapter(this,R.layout.item_noticia, noticias)
        noticias_list.adapter=myadapter

        noticias_list.setOnItemClickListener { parent, view, position, id ->
            goPage(view,position)
        }

        val buttonMenu = findViewById<ImageButton>(R.id.button)
        buttonMenu.setOnClickListener { abrirMenu() }
    }

    fun abrirMenu(){
        val openIntent = Intent(this, menu_1::class.java)
        startActivity(openIntent)
    }

    fun goPage(view: View, position: Int) {
        var url:String = ""
        when(position){
            0 -> url = "https://www.elespectador.com/noticias/el-mundo/el-aislamiento-de-brasil-en-la-lucha-contra-el-covid-19/"
            1 -> url = "https://cnnespanol.cnn.com/video/mortalidad-covid-america-estados-unidos-coronavirus-perspectivas-buenos-aires/"
            2 -> url = "https://www.semana.com/vida-moderna/articulo/pacientes-que-tomaron-antihipertensivos-tienen-menor-riesgo-de-hospitalizacion-o-muerte-por-covid-19-segun-estudio/202122/"
            3 -> url = "https://www.eltiempo.com/vida/ciencia/los-animales-en-los-que-oms-busca-el-origen-del-covid-19-577054"
            4 -> url = "https://www.dw.com/es/alemania-planea-ampliar-la-producci%C3%B3n-de-vacunas-contra-covid-19/a-57086610"
            5 -> url = "https://news.un.org/es/story/2021/03/1490322"
            6 -> url = "https://www.larepublica.co/globoeconomia/brasil-detecta-una-nueva-variante-del-covid-19-similar-a-la-detectada-en-sudafricana-3147477"
        }
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}