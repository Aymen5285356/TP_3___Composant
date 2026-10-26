package com.example.tp_3___composant

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class Exercice3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercice3)

        val circleImage = findViewById<ImageView>(R.id.circleImage)

        Glide.with(this)
            .load(R.drawable.sample)
            .apply(RequestOptions.circleCropTransform())
            .into(circleImage)
    }
}