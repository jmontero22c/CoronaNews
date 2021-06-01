package com.example.coronanews

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val NoticiasList =findViewById<ListView>(R.id.listaGuardadas)
        val Noticias = arrayListOf<Noticias>(
                Noticias("Qué se sabe de la nueva variante híbrida de covid-19 en vietnam","n_8"),
                Noticias("Murió el primer hombre que fue vacunado contra el covid en el mundo", "n_9"),
                Noticias("Desafíos Globales | La crisis del covid-19 en la India está fuera de control", "n_10"),
                Noticias("Qué es la neumonía bilateral, la afección más temida frente al COVID-19", "n_11"),
                Noticias("India bate récord mundial de casos de coronavirus en 24 horas", "n_1"),
                Noticias("Coronavirus: por qué se han \"disparado\" las muertes de personas más jóvenes en América Latina", "n_2"),
                Noticias("Coronavirus: por qué es tan difícil desarrollar fármacos para tratar un virus como el de la covid-19", "n_3"),
                Noticias("Coronavirus en India: cómo la crisis por la pandemia puede afectar la economía mundial", "n_4"),
                Noticias("OMS aprobó uso de emergencia de una vacuna china contra covid-19 por primera vez", "n_5"),
                Noticias("¿Cuál es la diferencia entre cepa, variante y linaje del COVID-19?", "n_6"),
                Noticias("Pfizer/BioNTech producirán 4.000 millones de dosis de vacuna contra covid en 2022", "n_7"),
                Noticias("Estados Unidos está celebrando el regreso de la vida precovid-19", "n_12")

        )

        val myadapter =NoticiasAdapter(this,R.layout.item_noticia, Noticias)

        if (NoticiasList.getAdapter() == null)
            NoticiasList.adapter=myadapter


        NoticiasList.setOnItemClickListener { parent, view, position, id ->
            goPage(position)
        }

        val buttonMenu = findViewById<ImageButton>(R.id.button)
        buttonMenu.setOnClickListener { abrirMenu() }


    }

    fun abrirMenu(){
        val openIntent = Intent(this, Menu::class.java)
        startActivity(openIntent)
    }

    fun goPage(position: Int) {
        var url:String = ""
        when(position){
            0 -> url = "https://www.bbc.com/mundo/noticias-57306455"
            1 -> url = "https://www.portafolio.co/mas-contenido/william-shakespeare-primer-hombre-vacunado-contra-covid-murio-552433"
            2 -> url = "https://cnnespanol.cnn.com/2021/05/07/desafios-globales-covid-19-india-jose-levy-podcast-orix/"
            3 -> url = "https://www.infobae.com/america/ciencia-america/2021/05/31/que-es-la-neumonia-bilateral-la-afeccion-mas-temida-frente-al-covid-19/"
            4 -> url = "https://www.telesurtv.net/news/india-bate-record-mundial-casos-diarios-covid-20210507-0004.html"
            5 -> url = "https://www.bbc.com/mundo/noticias-57010631"
            6 -> url = "https://www.bbc.com/mundo/noticias-56945251"
            7 -> url = "https://www.bbc.com/mundo/noticias-56943832"
            8 -> url = "https://www.larepublica.co/globoeconomia/oms-aprueba-uso-de-emergencia-de-una-vacuna-china-contra-covid-19-por-primera-vez-3166238"
            9 -> url = "https://bogota.gov.co/mi-ciudad/salud/diferencia-entre-cepa-variante-y-linaje-del-covid-19"
            10-> url = "https://www.larepublica.co/globoeconomia/pfizerbiontech-produciran-4000-millones-de-dosis-de-vacuna-contra-covid-en-2022-3166583"
            11-> url = "https://cnnespanol.cnn.com/2021/05/31/covid-estados-unidos-regreso-vida-trax/"
        }
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}