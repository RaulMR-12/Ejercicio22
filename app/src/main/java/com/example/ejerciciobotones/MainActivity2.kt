package com.example.ejerciciobotones

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val colorTextView = findViewById<TextView>(R.id.showColor)

        val colorRGB = intent.getIntExtra("color", Color.BLACK)
        val colorString = intent?.extras?.getString("color".toString())
        val button = findViewById<Button>(R.id.back)

        button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val red = Color.red(colorRGB)
        val green = Color.green(colorRGB)
        val blue = Color.blue(colorRGB)

        colorTextView.text = "RGB: $red $green $blue"
    }
}