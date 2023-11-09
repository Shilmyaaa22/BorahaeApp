package com.example.borahaeapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MarkFragment : Fragment() {
    private lateinit var spinnerFromCurrency: Spinner
    private lateinit var editTextAmount: EditText
    private lateinit var textViewResult: TextView

    private val currencies = arrayOf("IDR to USD", "USD to IDR", "IDR to WON", "WON to IDR", "IDR to JPY", "JPY to IDR")
    private var selectedCurrency: String = currencies[0]

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_mark, container, false)

        // Inisialisasi komponen-komponen
        spinnerFromCurrency = view.findViewById(R.id.spinnerFromCurrency)
        editTextAmount = view.findViewById(R.id.editTextAmount)
        textViewResult = view.findViewById(R.id.textViewResult)

        // Inisialisasi Spinner
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, currencies)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerFromCurrency.adapter = adapter

        spinnerFromCurrency.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                selectedCurrency = currencies[position]
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        return view
    }

    // Fungsi untuk mengkonversi mata uang
    fun convertCurrency(view: View) {
        val amount = editTextAmount.text.toString().toDouble()
        val result = when (selectedCurrency) {
            "IDR to USD" -> convertIDRtoUSD(amount)
            "USD to IDR" -> convertUSDtoIDR(amount)
            "IDR to WON" -> convertIDRtoWON(amount)
            "WON to IDR" -> convertWONtoIDR(amount)
            "IDR to JPY" -> convertIDRtoJPY(amount)
            "JPY to IDR" -> convertJPYtoIDR(amount)
            else -> 0.0
        }

        textViewResult.text = "Result: $result"
    }

    private fun convertIDRtoUSD(amount: Double): Double {
        // Implementasi konversi IDR to USD di sini
        return amount / 14000 // Contoh perhitungan sederhana
    }

    private fun convertUSDtoIDR(amount: Double): Double {
        // Implementasi konversi USD to IDR di sini
        return amount * 14000 // Contoh perhitungan sederhana
    }

    private fun convertIDRtoWON(amount: Double): Double {
        // Implementasi konversi IDR to WON di sini
        return amount / 12.5 // Contoh perhitungan sederhana
    }

    private fun convertWONtoIDR(amount: Double): Double {
        // Implementasi konversi WON to IDR di sini
        return amount * 12.5 // Contoh perhitungan sederhana
    }

    private fun convertIDRtoJPY(amount: Double): Double {
        // Implementasi konversi IDR to JPY di sini
        return amount / 130 // Contoh perhitungan sederhana
    }

    private fun convertJPYtoIDR(amount: Double): Double {
        // Implementasi konversi JPY to IDR di sini
        return amount * 130 // Contoh perhitungan sederhana
    }
}
