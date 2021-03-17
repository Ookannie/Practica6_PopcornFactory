package gamez.ana.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detalle_pelicula.*
import kotlin.random.Random

class DetallePelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        val bundle = intent.extras
        var ns = 0;
        var id = -1
        var title =""
        var r = Random
        var randomSeats = r.nextInt(21)
        if(bundle != null){

            //ns = bundle.getInt("numberSeats")
            title = bundle.getString("nombre")!!
            pelicula_img.setImageResource(bundle.getInt("header"))
            pelicula_nombre.setText(bundle.getString("nombre"))
            pelicula_desc.setText(bundle.getString("sinopsis"))
            //seatsLeft.setText("$ns seats available")
            seatsLeft.setText("$randomSeats seats available")
            id = bundle.getInt("pos")

        }

        if(randomSeats == 0){
            buyTickets.isEnabled = false
        }else{
            buyTickets.setOnClickListener {
                val intent: Intent = Intent(this, SeatSelection::class.java)
                intent.putExtra("id", id)
                intent.putExtra("name", title)
                intent.putExtra("seatsAvailable", randomSeats)
                this.startActivity(intent)

            }
        }
    }
}