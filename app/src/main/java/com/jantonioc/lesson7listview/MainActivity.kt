package com.jantonioc.lesson7listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var lvCountries:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lvCountries = findViewById(R.id.lvCountries)

        val countryNames = arrayOf("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17")

        val countryAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,countryNames)

        lvCountries.adapter = countryAdapter

        lvCountries.setOnItemClickListener{adapterView,view,i,l ->
            val countryName = lvCountries.getItemAtPosition(i).toString()
            Toast.makeText(this@MainActivity,countryName,Toast.LENGTH_SHORT).show()
        }

    }
}