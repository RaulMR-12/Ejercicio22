package com.example.ejerciciobotones

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val redButton = findViewById<Button>(R.id.red)
        val greenButton = findViewById<Button>(R.id.green)
        val blueButton = findViewById<Button>(R.id.blue)

        redButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("color", Color.rgb(255, 0, 0))
            startActivity(intent)
        }

        greenButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("color", Color.rgb(0, 255, 0))
            startActivity(intent)
        }

        blueButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("color", Color.rgb(0, 0, 255))
            startActivity(intent)
        }
    }
}