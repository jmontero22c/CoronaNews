package com.example.coronanews

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val spinner = findViewById<Spinner>(R.id.spinner)
        val adapterSpinner: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(this,R.array.Opciones,android.R.layout.simple_spinner_item)
        spinner.adapter=adapterSpinner*/

        /*val spinner: Spinner = findViewById(R.id.spinner)
        ArrayAdapter.createFromResource(this, R.array.Opciones, android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        } */

        val noticias_list =findViewById<ListView>(R.id.noticias)
        val noticiasGuardadas = findViewById<ListView>(R.id.noticias)
        val noticias = arrayListOf<noticias>(
                noticias("India bate récord mundial de casos de coronavirus en 24 horas", "n_1"),
                noticias("Coronavirus: por qué se han \"disparado\" las muertes de personas más jóvenes en América Latina", "n_2"),
                noticias("Coronavirus: por qué es tan difícil desarrollar fármacos para tratar un virus como el de la covid-19", "n_3"),
                noticias("Coronavirus en India: cómo la crisis por la pandemia puede afectar la economía mundial", "n_4"),
                noticias("OMS aprobó uso de emergencia de una vacuna china contra covid-19 por primera vez", "n_5"),
                noticias("¿Cuál es la diferencia entre cepa, variante y linaje del COVID-19?", "n_6"),
                noticias("Pfizer/BioNTech producirán 4.000 millones de dosis de vacuna contra covid en 2022", "n_7"),
                noticias("Desafíos Globales | La crisis del covid-19 en la India está fuera de control", "n_8")
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
            0 -> url = "https://www.telesurtv.net/news/india-bate-record-mundial-casos-diarios-covid-20210507-0004.html"
            1 -> url = "https://www.bbc.com/mundo/noticias-57010631"
            2 -> url = "https://www.bbc.com/mundo/noticias-56945251"
            3 -> url = "https://www.bbc.com/mundo/noticias-56943832"
            4 -> url = "https://www.larepublica.co/globoeconomia/oms-aprueba-uso-de-emergencia-de-una-vacuna-china-contra-covid-19-por-primera-vez-3166238"
            5 -> url = "https://bogota.gov.co/mi-ciudad/salud/diferencia-entre-cepa-variante-y-linaje-del-covid-19"
            6 -> url = "https://www.larepublica.co/globoeconomia/pfizerbiontech-produciran-4000-millones-de-dosis-de-vacuna-contra-covid-en-2022-3166583"
            7 -> url = "https://cnnespanol.cnn.com/2021/05/07/desafios-globales-covid-19-india-jose-levy-podcast-orix/"
        }
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}