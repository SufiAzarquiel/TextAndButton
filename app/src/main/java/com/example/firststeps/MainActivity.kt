package com.example.firststeps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tvWelcome: TextView
    private val name = "Sufi"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvWelcome = findViewById(R.id.tvWelcome)
        val btnClick = findViewById<Button>(R.id.btnClick)
        btnClick.setOnClickListener { onBtnClick() }
    }

    private var par = 1
    private fun onBtnClick() {
        if (par == 2) {
            tvWelcome.text = "Hello World!"
            par--
        } else {
            tvWelcome.text = "Welcome $name"
            par++
        }
    }
}
