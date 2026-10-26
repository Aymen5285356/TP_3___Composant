package com.example.tp_3___composant

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnEx1).setOnClickListener {
            startActivity(Intent(this, Exercice1Activity::class.java))
        }
        findViewById<Button>(R.id.btnEx2).setOnClickListener {
            startActivity(Intent(this, Exercice2Activity::class.java))
        }
        findViewById<Button>(R.id.btnEx3).setOnClickListener {
            startActivity(Intent(this, Exercice3Activity::class.java))
        }
    }
}