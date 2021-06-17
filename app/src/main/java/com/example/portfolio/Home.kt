package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        next.setOnClickListener {
            val intent = Intent(this@Home, Contact::class.java)
            startActivity(intent)
        }
        abt.setOnClickListener {
            val intent = Intent(this@Home, About::class.java)
            startActivity(intent)
        }
        nwsl.setOnClickListener {
            val intent = Intent(this@Home, Newsletter::class.java)
            startActivity(intent)

        }
    }
}
