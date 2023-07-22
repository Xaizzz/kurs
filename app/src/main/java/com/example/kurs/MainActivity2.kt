package com.example.kurs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kurs.databinding.ActivityMain2Binding
import android.view.View
import androidx.core.view.isVisible

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    private var signState = "empty"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}