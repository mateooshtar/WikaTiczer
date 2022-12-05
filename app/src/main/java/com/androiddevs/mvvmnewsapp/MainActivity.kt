package com.androiddevs.mvvmnewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var arr = arrayOf<Int>(1,2,3,4,5)

        for ((i, v) in arr.withIndex()) {
            println("$i: $v")
            Toast.makeText(this,"$i: $v",Toast.LENGTH_LONG).show()
        }

        for (x in 10 downTo 1) println()




    }
}
