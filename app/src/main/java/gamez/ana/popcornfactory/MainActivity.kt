package gamez.ana.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

import kotlinx.android.synthetic.main.pelicula.view.*

class MainActivity : AppCompatActivity() {

    var adapter: PeliculaAdapter? = null
    var peliculas = ArrayList<Pelicula>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cargarPeliculas()

        adapter = PeliculaAdapter(this, peliculas)
        gridView.adapter = adapter
    }

    fun cargarPeliculas(){
        peliculas.add(Pelicula("Bones", R.drawable.bones, R.drawable.bonesheader, R.string.desc_bones.toString()))
    }
}

