package com.example.kurs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kurs.databinding.ActivityMain2Binding
import com.example.kurs.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}



