package gamez.ana.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import kotlinx.android.synthetic.main.activity_lista_peliculas.*


class ListaPeliculasActivity : AppCompatActivity() {
    var adapter: PeliculaAdapter? = null
    var peliculas = ArrayList<Pelicula>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_peliculas)
        cargarPeliculas()

        adapter = PeliculaAdapter(this, peliculas)
         gridview.adapter = adapter
    }

    fun cargarPeliculas(){
        peliculas.add(Pelicula(getString(R.string.titulo_bones), R.drawable.bones, R.drawable.bonesheader, getString(R.string.desc_bones), arrayListOf<Cliente>()))
        peliculas.add(Pelicula(getString(R.string.titulo_drhouse), R.drawable.drhouse, R.drawable.drwhoheader, getString(R.string.desc_house), arrayListOf<Cliente>()))
        peliculas.add(Pelicula(getString(R.string.titulo_hero), R.drawable.bighero6, R.drawable.headerbighero6,getString( R.string.desc_hero), arrayListOf<Cliente>()))
        peliculas.add(Pelicula(getString(R.string.titulo_who), R.drawable.drwho, R.drawable.drwhoheader,getString( R.string.desc_who), arrayListOf<Cliente>()))
        peliculas.add(Pelicula(getString(R.string.titulo_friends), R.drawable.friends, R.drawable.friendsheader,getString (R.string.desc_friends), arrayListOf<Cliente>()))
        peliculas.add(Pelicula(getString(R.string.titulo_inception), R.drawable.inception, R.drawable.inceptionheader,getString (R.string.desc_inception), arrayListOf<Cliente>()))
        peliculas.add(Pelicula(getString(R.string.titulo_leap), R.drawable.leapyear, R.drawable.leapyearheader, getString(R.string.desc_leap), arrayListOf<Cliente>()))
        peliculas.add(Pelicula(getString(R.string.titulo_toy), R.drawable.toystory, R.drawable.toystoryheader, getString(R.string.desc_toy), arrayListOf<Cliente>()))
        peliculas.add(Pelicula(getString(R.string.titulo_small), R.drawable.smallville, R.drawable.smallvilleheader, getString(R.string.desc_small), arrayListOf<Cliente>()))
    }
}