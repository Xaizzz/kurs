package com.example.kurs

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kurs.databinding.ActivityMainBinding
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    private lateinit var bindingClass: ActivityMainBinding
    private val adapter = AnimalAdapter()
    private val imageIdList = listOf(
        R.drawable.jiraffe,
        R.drawable.leopard,
        R.drawable.zebra,
        R.drawable.tiger,
        R.drawable.panda
    )
    private var index = 0


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        init()

    }

    private fun init() {
        bindingClass.apply {
            RCview.layoutManager = GridLayoutManager(this@MainActivity, 2)
            RCview.adapter = adapter
            buttonAdd.setOnClickListener {
                if (index > 4) index = 0
                val animal = Animal(imageIdList[index], "Animal $index")

                adapter.addAnimal(animal)
                index++
            }
        }
    }


}

