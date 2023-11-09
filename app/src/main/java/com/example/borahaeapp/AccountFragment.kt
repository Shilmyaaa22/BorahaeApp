package com.example.borahaeapp
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class AccountFragment : Fragment() {
    private lateinit var textViewUsername: TextView
    private lateinit var textViewName: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_account, container, false)

        // Inisialisasi komponen-komponen
        textViewUsername = view.findViewById(R.id.textViewUsername)
        textViewName = view.findViewById(R.id.textViewName)

        // Mendapatkan data username dan nama (gantilah dengan data sebenarnya)
        val username = "shilmy.aulia" // Gantilah dengan username yang sesuai
        val name = "Nama Pengguna" // Gantilah dengan nama yang sesuai

        // Set teks pada TextView
        textViewUsername.text = "Username: $username"
        textViewName.text = "Name: $name"

        return view
    }
}
