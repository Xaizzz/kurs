package com.example.kurs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kurs.databinding.ActivityMain2Binding
import com.example.kurs.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding
    var login = ""
    var password = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.BRegBack.setOnClickListener {
            finish()
        }
        binding.bInputLog.setOnClickListener{
            if(binding.eTpas.text.toString()  == binding.eTpas2.text.toString()){
                login = binding.eTlog.text.toString()
                password = binding.eTpas.text.toString()
                binding.tVinfoReg.text = "Регистрация успешна"
            }else{
                binding.tVinfoReg.text = "Пошел нахуй"

            }
        }


    }
}