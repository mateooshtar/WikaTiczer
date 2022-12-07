package com.androiddevs.mvvmnewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Phone
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var stefek = Person("Stefan", "Brzęczyszczykiewicz", 502175684)
        stefek.whoAreYou()
    }
}


abstract class Person {

    abstract var name: String
    abstract var surname: String
    abstract var phone: Long
    abstract var gender: String



    fun whoAreYou() {
        return println("Siema, jestem $name $surname. Mój nr telefonu to $phone")
    }

    abstract fun setGender(genderToSet: String) : String
    abstract fun getGender() : Int
    abstract fun goPee() : String

}

class Man(name: String, surname:String, gender: String) {

}