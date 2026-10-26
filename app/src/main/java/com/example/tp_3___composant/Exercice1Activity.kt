package com.example.tp_3___composant

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity

class Exercice1Activity : AppCompatActivity() {

    private val viewModel: CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercice1)

        val tvCounter = findViewById<TextView>(R.id.tvCounter)

        // Observer LiveData : l'UI se met à jour automatiquement
        viewModel.counter.observe(this) { value ->
            tvCounter.text = value.toString()
        }

        findViewById<Button>(R.id.btnIncrement).setOnClickListener {
            viewModel.increment()
        }
        findViewById<Button>(R.id.btnDecrement).setOnClickListener {
            viewModel.decrement()
        }
    }
}