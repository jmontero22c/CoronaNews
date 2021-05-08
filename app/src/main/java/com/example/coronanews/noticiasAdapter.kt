package com.example.coronanews

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView


class noticiasAdapter(val ctx:Context, val res: Int, val objs:ArrayList<noticias>)
    :ArrayAdapter<noticias>(ctx,res,objs) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val datos:noticias =objs.get(position)

        val inflater = ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(res, parent, false)
        val titular =view.findViewById<TextView>(R.id.titular)
        titular.text = datos.titular

        val image = view.findViewById<ImageView>(R.id.icono_noticia)
        val imageName = ctx.resources.getIdentifier(datos.imagen, "drawable",ctx.packageName)
        image.setImageResource(imageName)

        return view
    }

}