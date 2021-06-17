package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView

class  BottomNav : AppCompatActivity(),BottomNavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_nav)
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom)

        bottomNav.setOnNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when(item.itemId){

            R.id.home -> {
                val intenthome = Intent(this@BottomNav,Home::class.java)
                startActivity(intenthome)
            }
            R.id.contact -> {
                val intentcont = Intent(this@BottomNav,Contact::class.java)
                startActivity(intentcont)
            }
            R.id.about -> {
                val intentabt = Intent(this@BottomNav,About::class.java)
                startActivity(intentabt)
            }
            R.id.news -> {
                val intentnews = Intent(this@BottomNav,Newsletter::class.java)
                startActivity(intentnews)
            }
        }
        return true

    }

}