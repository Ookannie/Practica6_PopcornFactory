package gamez.ana.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ReservacionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reservacion)

        val title: TextView = findViewById(R.id.movie)
        val numSeat: TextView = findViewById(R.id.numSeat)
        val bundle = intent.extras

        if (bundle!= null){
            title.setText("Seat number" +bundle.getString("movie"))
            numSeat.setText(bundle.getInt("seat").toString())
        }
    }
}