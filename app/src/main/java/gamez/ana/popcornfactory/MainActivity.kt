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
        peliculas.add(Pelicula("Bones", R.drawable.bones, R.drawable.bonesheader, R.string.desc_bones))
        peliculas.add(Pelicula("Dr.House", R.drawable.drhouse, R.drawable.drwhoheader, R.string.desc_house))
        peliculas.add(Pelicula("Big Hero 6", R.drawable.bighero6, R.drawable.headerbighero6, R.string.desc_hero))
        peliculas.add(Pelicula("Dr. Who", R.drawable.drwho, R.drawable.drwhoheader, R.string.desc_who))
        peliculas.add(Pelicula("Friends", R.drawable.friends, R.drawable.friendsheader, R.string.desc_friends))
        peliculas.add(Pelicula("Inception", R.drawable.inception, R.drawable.inceptionheader, R.string.desc_inception))
        peliculas.add(Pelicula("Leap Year", R.drawable.leapyear, R.drawable.leapyearheader, R.string.desc_leap))
        peliculas.add(Pelicula("Toy Story", R.drawable.toystory, R.drawable.toystoryheader, R.string.desc_toy))
        peliculas.add(Pelicula("Smallville", R.drawable.smallville, R.drawable.smallvilleheader, R.string.desc_small))
    }
}

