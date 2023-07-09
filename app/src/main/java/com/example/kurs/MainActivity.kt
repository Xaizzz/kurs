package com.example.kurs

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.kurs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.button.setOnClickListener {
            if (bindingClass.edValue.text.toString()
                    .isNotEmpty()
            ) {
                val value = bindingClass.edValue.text.toString()

                when (value) {
                    Constance.DIRECTOR -> {
                        val tempText = "Вам начислено: ${Constance.NIKITA_SALARY}"
                        bindingClass.result.text = tempText
                        bindingClass.result.visibility = View.VISIBLE
                    }

                    Constance.ENGINEER -> {
                        val tempText = "Вам начислено: ${Constance.AMIR_SALARY}"
                        bindingClass.result.text = tempText
                        bindingClass.result.visibility = View.VISIBLE
                    }

                    Constance.DEVELOPER -> {
                        val tempText = "Вам начислено: ${Constance.DIMA_SALARY}"
                        bindingClass.result.text = tempText
                        bindingClass.result.visibility = View.VISIBLE
                    }

                    Constance.QA -> {
                        val tempText = "Вам начислено: ${Constance.DENIS_SALARY}"
                        bindingClass.result.text = tempText
                        bindingClass.result.visibility = View.VISIBLE
                    }

                    Constance.TESTER -> {
                        val tempText = "Вам начислено: ${Constance.EVDOKIM_SALARY}"
                        bindingClass.result.text = tempText
                        bindingClass.result.visibility = View.VISIBLE
                    }

                    Constance.MANAGER -> {
                        val tempText = "Вам начислено: ${Constance.IVAN_SALARY}"
                        bindingClass.result.text = tempText
                        bindingClass.result.visibility = View.VISIBLE
                    }


                    else -> {
                        bindingClass.result.text = "Не найдено"
                        bindingClass.result.visibility = View.VISIBLE
                    }

                }


            } else {
                bindingClass.result.text = "Не найдено"
                bindingClass.result.visibility = View.VISIBLE
            }
        }


    }

    object Constance {
        const val NIKITA_SALARY = 10000
        const val AMIR_SALARY = 20000
        const val DIMA_SALARY = 30000
        const val DENIS_SALARY = 40000
        const val EVDOKIM_SALARY = 50000
        const val IVAN_SALARY = 60000
        const val DIRECTOR = "Nikita"
        const val ENGINEER = "Amir"
        const val DEVELOPER = "Dima"
        const val QA = "Denis"
        const val TESTER = "Evdokim"
        const val MANAGER = "Ivan"
    }
}


