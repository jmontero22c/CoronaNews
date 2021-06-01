package com.example.coronanews

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*


class NoticiasAdapter(val ctx:Context, val res: Int, val objs:ArrayList<Noticias>)
    :ArrayAdapter<Noticias>(ctx,res,objs) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val datos:Noticias =objs.get(position)

        val inflater = ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(res, parent, false)
        val titular =view.findViewById<TextView>(R.id.titular)
        titular.text = datos.titular

        val image = view.findViewById<ImageView>(R.id.icono_noticia)
        val imageName = ctx.resources.getIdentifier(datos.imagen, "drawable",ctx.packageName)
        image.setImageResource(imageName)
        var auxWhite = true

        val leido = view.findViewById<Button>(R.id.leida)

        leido.setOnClickListener {

            if(auxWhite == true) {
                titular.setBackgroundColor(Color.GREEN)
                auxWhite = false
            }else{
                leido.setOnClickListener{titular.setBackgroundColor(Color.WHITE)}
                auxWhite = true
            }


        }

        return view
    }

}