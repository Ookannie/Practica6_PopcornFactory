package gamez.ana.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.*
import kotlin.collections.ArrayList

class SeatSelection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seat_selection)

        val title: TextView = findViewById(R.id.titleSeats)
        var posMovie = -1

        val bundle = intent.extras
        var seats = 0
        var movie: String = ""


        if(bundle != null){
            title.setText(bundle.getString("name"))
            movie = bundle.getString("name")!!
            posMovie = bundle.getInt("id")
            seats = bundle.getInt("seats")
        }

        val confirm : Button = findViewById(R.id.confirm)

        confirm.setOnClickListener {
            //todo añadir reservar el lugar seleccionado por el usuario
            //hacer una nueva actividad donde se vea el resumen de la compra
            //se agregue el nombre del cliente y se vea el asiento que reservó
            Toast.makeText(this, "Enjoy the movie", Toast.LENGTH_LONG).show()
        }
        
        val row1: RadioGroup = findViewById(R.id.row1)
        val row2: RadioGroup = findViewById(R.id.row2)
        val row3: RadioGroup = findViewById(R.id.row3)
        val row4: RadioGroup = findViewById(R.id.row4)
        
        row1.setOnCheckedChangeListener { group, checkedId ->

            if(checkedId > -1){
                row2.clearCheck()
                row3.clearCheck()
                row4.clearCheck()
                row1.check(checkedId)

            }
        }

        row2.setOnCheckedChangeListener { group, checkedId ->

            if(checkedId > -1){
                row1.clearCheck()
                row3.clearCheck()
                row4.clearCheck()
                row2.check(checkedId)

            }
        }

        row3.setOnCheckedChangeListener { group, checkedId ->

            if(checkedId > -1){
                row2.clearCheck()
                row1.clearCheck()
                row4.clearCheck()
                row3.check(checkedId)

            }
        }

        row4.setOnCheckedChangeListener { group, checkedId ->

            if(checkedId > -1){
                row2.clearCheck()
                row3.clearCheck()
                row1.clearCheck()
                row4.check(checkedId)

            }
        }

        disableButtons(seats)

    }

    fun disableButtons(seatsav: Int){
        var seats: ArrayList<Int> = ArrayList<Int>()

        for(i in 0 until seatsav){
            seats.add(1)
        }

        for (i in seatsav until 20){
            seats.add(0)
        }

        Collections.shuffle(seats)

        for(i in 0 until 20){
            if(seats.get(i)==0){
                var radioId: String = "seat" + (i+1)
                var resID: Int = resources.getIdentifier(radioId, "id", packageName)
                var radio: RadioButton = findViewById(resID)
                radio.isEnabled  = false
            }
        }

    }
}