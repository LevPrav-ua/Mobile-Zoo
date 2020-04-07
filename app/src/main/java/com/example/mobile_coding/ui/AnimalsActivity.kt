package com.example.mobile_coding.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.mobile_coding.R
import com.example.mobile_coding.model.Parrot

class AnimalsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.testTextView)

        val parrot1 = Parrot("TestName", 6)

        textView.text = parrot1.getInfo()
    }
}