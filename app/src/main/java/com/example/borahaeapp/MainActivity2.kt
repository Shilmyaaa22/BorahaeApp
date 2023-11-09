package com.example.borahaeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        loadFragment(HomeFragment())
        var bottomnav = findViewById<BottomNavigationView>(R.id.menuBott)
        bottomnav.setOnItemReselectedListener {
            when(it.itemId) {
                R.id.menu_bott_home-> {
                    loadFragment(HomeFragment())
                    true
                }
                R.id.menu_bott_mark-> {
                    true
                    loadFragment(MarkFragment())
                }
                R.id.menu_bott_calculate-> {
                    true
                    loadFragment(CalculateFragment)
                }
                R.id.menu_bott_account-> {
                    true
                    loadFragment(AccountFragment())
                } else -> {
                    false
                }
            }
        }
    }
    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction.replace(R.id.contrainer,fragment)
        transaction.commit()
    }
}