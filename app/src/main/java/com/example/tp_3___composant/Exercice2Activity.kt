package com.example.tp_3___composant

import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class Exercice2Activity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private val imageUrl = "https://picsum.photos/600/400"

    // Intent de sélection d'image (doit être déclaré ici, pas dans onCreate)
    private val pickImage =
        registerForActivityResult(ActivityResultContracts.GetContent()) { uri: Uri? ->
            uri?.let { Glide.with(this).load(it).into(imageView) }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercice2)

        imageView = findViewById(R.id.imageView)

        // 1) Image locale depuis res/drawable
        findViewById<Button>(R.id.btnLocal).setOnClickListener {
            imageView.setImageResource(R.drawable.sample)
        }

        // 2) Image distante avec Glide
        findViewById<Button>(R.id.btnUrl).setOnClickListener {
            Glide.with(this)
                .load(imageUrl)
                .placeholder(android.R.drawable.progress_horizontal)
                .error(android.R.drawable.stat_notify_error)
                .into(imageView)
        }

        // 3) Image depuis le stockage de l'appareil
        findViewById<Button>(R.id.btnGallery).setOnClickListener {
            pickImage.launch("image/*")
        }
    }
}