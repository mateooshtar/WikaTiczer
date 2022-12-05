package com.androiddevs.mvvmnewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var z = 0
//
//
//        val toast = if (z > 0 ) { Toast.makeText(this, "Dodatnia", Toast.LENGTH_LONG).show(); println("Dodatnia liczba"); "Dodatniaaaaa"} else Toast.makeText(this, "Ujemna", Toast.LENGTH_SHORT).show()
//        println(toast)


//        val kotlin = when {
//            z == "musztarda" -> "Muśtryk"
//            z == "keczup" -> "kepuć"
//            z == "Programming language" -> "ucz sie uju"
//            else -> "miejscowość"
//        }

        when(z) {
            1 -> "dodatnia"
            -1 -> "ujemna"
            else -> "urojona"
        }


        println(kotlin)

        Toast.makeText(this, kotlin, Toast.LENGTH_LONG).show()

    }
}
