package com.androiddevs.mvvmnewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var stefanMatematyk = lambda(10,50) {
            x,y -> (x+y).toString()
        }

        println(stefanMatematyk)

        var table = listOf(1,2,3,4,5)

        table.forEach{item ->
            var i = item * item
            for (x in 1..10) {
                println("$i huehueeeee")
            }
        }



    }


    fun lambda(a: Int, b: Int, c: (Int,Int) -> String) : String {
        return ("$a + $b = ${a+b}. ${c(a, b)}")
    }

    var add = { a: Int, b: Int -> a - b }



}
