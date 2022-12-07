package com.androiddevs.mvvmnewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Phone
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var person1 = Person("Joanna","Female",555555555, listOf("Pranie", "Sprzątanie", "Gotowanie"))
        person1.showMeYourSkills()
        person1.whatIsYourName2()
        person1.whatIsYourName()



    }

    abstract class Human {
        constructor(name: String, gender: String, phone: Long, skills: List<String>) {
            this.name = name
            this.phone = phone
            this.gender = gender
            this.skills = skills
        }

        var name: String
        var gender: String
        var phone: Long
        abstract var skills: List<String>

        fun whatIsYourName() : Unit {
            return println("My name is $name")
        }

        var whatIsYourName2 = { println("lambda My name is $this.name")} //tu nie wiem jak się odwołać do name :/

        abstract fun showMeYourSkills(): Unit
    }


    class Person(name: String, gender: String, phone: Long, listOfSkills: List<String> ) : Human(name, gender, phone, listOfSkills) {
        override var skills: List<String> = listOfSkills

        override fun showMeYourSkills(): Unit {
            var stringSkills= "Moje umiejętności to:" //nie powinienem tutaj tego pisać, tylko inaczej zaimplemetować, ale walić to w tym przykładzie xd

            for (s in skills) {
                stringSkills = "$stringSkills $s"
            }
            return println(stringSkills)
        }

    }


}