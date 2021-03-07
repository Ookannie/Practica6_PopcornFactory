package gamez.ana.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lista_peliculas.*


class ListaPeliculasActivity : AppCompatActivity() {
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
        peliculas.add(Pelicula(getString(R.string.titulo_bones), R.drawable.bones, R.drawable.bonesheader, getString(R.string.desc_bones)))
        peliculas.add(Pelicula(getString(R.string.titulo_drhouse), R.drawable.drhouse, R.drawable.drwhoheader, getString(R.string.desc_house)))
        peliculas.add(Pelicula(getString(R.string.titulo_hero), R.drawable.bighero6, R.drawable.headerbighero6,getString( R.string.desc_hero)))
        peliculas.add(Pelicula(getString(R.string.titulo_who), R.drawable.drwho, R.drawable.drwhoheader,getString( R.string.desc_who)))
        peliculas.add(Pelicula(getString(R.string.titulo_friends), R.drawable.friends, R.drawable.friendsheader,getString (R.string.desc_friends)))
        peliculas.add(Pelicula(getString(R.string.titulo_inception), R.drawable.inception, R.drawable.inceptionheader,getString (R.string.desc_inception)))
        peliculas.add(Pelicula(getString(R.string.titulo_leap), R.drawable.leapyear, R.drawable.leapyearheader, getString(R.string.desc_leap)))
        peliculas.add(Pelicula(getString(R.string.titulo_toy), R.drawable.toystory, R.drawable.toystoryheader, getString(R.string.desc_toy)))
        peliculas.add(Pelicula(getString(R.string.titulo_small), R.drawable.smallville, R.drawable.smallvilleheader, getString(R.string.desc_small)))
    }
}