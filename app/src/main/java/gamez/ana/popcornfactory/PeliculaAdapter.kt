package gamez.ana.popcornfactory

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_detalle_pelicula.view.*
import kotlinx.android.synthetic.main.pelicula.view.*

class  PeliculaAdapter: BaseAdapter {

    var peliculas = ArrayList<Pelicula>()
    var context: Context? = null

    constructor(context: Context, peliculas: ArrayList<Pelicula>){
        this.context = context
        this.peliculas = peliculas
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var pelicula = peliculas[position]
        var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var vista = inflator.inflate(R.layout.pelicula, null)
        vista.id_pelicula.setImageResource(pelicula.image)
        vista.pelicula_titulo.setText(pelicula.titulo)

        vista.id_pelicula.setOnClickListener {
            var seatsAvailable = 20-pelicula.seats.size
            Log.d("SEATS", "$seatsAvailable")
            var intent = Intent(context, DetallePelicula::class.java)
            intent.putExtra("nombre", pelicula.titulo)
            intent.putExtra("image", pelicula.image)
            intent.putExtra("header", pelicula.header)
            intent.putExtra("sinopsis", pelicula.sinopsis)
            intent.putExtra("numberSeats", (seatsAvailable))
            intent.putExtra("pos", position)
            context!!.startActivity(intent)
        }

        return vista
    }

    override fun getItem(position: Int): Any {
       return  peliculas[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
       return peliculas.size
    }

}