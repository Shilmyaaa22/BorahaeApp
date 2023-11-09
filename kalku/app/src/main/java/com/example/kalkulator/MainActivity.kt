package com.example.kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editText = findViewById<EditText>(R.id.input1)
        var editText2 = findViewById<EditText>(R.id.input2)
        var texthasil = findViewById<TextView>(R.id.result)

        var tombolTambah = findViewById<Button>(R.id.plus)
        var tombolKurang = findViewById<Button>(R.id.minus)
        var tombolKali = findViewById<Button>(R.id.multiply)
        var tombolBagi = findViewById<Button>(R.id.divide)

        //var bil1 : Double = editText.text.toString().toDouble()
        //var bil2 : Double = editText2.text.toString().toDouble()
        
        tombolTambah.setOnClickListener {

            //var bil1 : Double = editText.text.toString().toDouble()
            //var bil2 : Double = editText2.text.toString().toDouble()

            //Log.d("Putri", "bil1: " + bil1 + ", bil2: " + bil2 +)
        }


    }
}