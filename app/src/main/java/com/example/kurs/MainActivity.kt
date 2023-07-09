package com.example.kurs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.TextureView
import android.view.View
import android.widget.TextView
import com.example.kurs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.button.setOnClickListener {
            if (bindingClass.edValue.text.toString()
                    .isNotEmpty()
            ) {
                val value = bindingClass.edValue.text.toString().toInt()

                when (value) {
                    in 1..10000 -> {
                        bindingClass.result.text = "Начинающий"
                        bindingClass.result.visibility = View.VISIBLE
                    }

                    in 10001..100000 -> {
                        bindingClass.result.text = "Любитель"
                        bindingClass.result.visibility = View.VISIBLE
                    }

                    in 100001..500000 -> {
                        bindingClass.result.text = "Популярный"
                        bindingClass.result.visibility = View.VISIBLE
                    }

                    in 500001..1000000 -> {
                        bindingClass.result.text = "Очень популярный"
                        bindingClass.result.visibility = View.VISIBLE
                    }

                    in 1000001..100000000 -> {
                        bindingClass.result.text = "Звезда"
                        bindingClass.result.visibility = View.VISIBLE
                    }

                    else -> {
                        bindingClass.result.text = "Ваше число не попадает в рамки"
                        bindingClass.result.visibility = View.VISIBLE
                    }

                }


            } else {
                bindingClass.result.text = "Ваше число не попадает в рамки"
                bindingClass.result.visibility = View.VISIBLE
            }
        }
    }
}


