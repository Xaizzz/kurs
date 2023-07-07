package com.example.kurs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.kurs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding
    val a = 324
    val b = 34
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.a.text = "a"
        bindingClass.b.text = "b"
        bindingClass.b1.setOnClickListener {
            bindingClass.result.text = (a + b).toString()

        }
        bindingClass.b2.setOnClickListener {
            bindingClass.result.text = (a - b).toString()
        }
        bindingClass.b3.setOnClickListener {
            bindingClass.result.text = (a * b).toString()
        }
        bindingClass.b4.setOnClickListener {
            bindingClass.result.text = (a / b).toString()
        }


        }


    }


