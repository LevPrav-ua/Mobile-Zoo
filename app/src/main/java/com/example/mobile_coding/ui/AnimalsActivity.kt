package com.example.mobile_coding.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.mobile_coding.model.Cat
import com.example.mobile_coding.R
import com.example.mobile_coding.model.Dog
import com.example.mobile_coding.model.Parrot

class AnimalsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val parrotTextView = findViewById<TextView>(R.id.parrotTextView)
        val catTextView = findViewById<TextView>(R.id.catTextView)
        val dogTextView = findViewById<TextView>(R.id.dogTextView)

        val parrot = Parrot("Krasava", 6)
        val cat = Cat("Pushok", 3)
        val dog = Dog("Sharik", 8)

        parrotTextView.text = parrot.getInfo()
        catTextView.text = cat.getInfo()
        dogTextView.text = dog.getInfo()
    }
}