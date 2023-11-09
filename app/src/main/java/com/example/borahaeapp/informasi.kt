package com.example.borahaeapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet

class informasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informasi)

        // Inisialisasi BarChart
        val barChartRating: BarChart = findViewById(R.id.barChartRating)

        // Data untuk BarChart (contoh)
        val ratings = ArrayList<BarEntry>()
        ratings.add(BarEntry(1f, 4f)) // Misalnya, skor 4
        ratings.add(BarEntry(2f, 3f)) // Misalnya, skor 3
        ratings.add(BarEntry(3f, 5f)) // Misalnya, skor 5
        ratings.add(BarEntry(4f, 4f)) // Misalnya, skor 4
        ratings.add(BarEntry(5f, 4.5f)) // Misalnya, skor 4.5

        val barDataSet = BarDataSet(ratings, "Rating")
        barDataSet.setColors(intArrayOf(android.R.color.holo_red_light, android.R.color.holo_orange_light, android.R.color.holo_green_light, android.R.color.holo_blue_light, android.R.color.holo_purple))

        val dataSets: ArrayList<IBarDataSet> = ArrayList()
        dataSets.add(barDataSet)

        val data = BarData(dataSets)
        barChartRating.data = data

        // Konfigurasi BarChart (misalnya, sumbu, legenda, dll.)
    }
}

