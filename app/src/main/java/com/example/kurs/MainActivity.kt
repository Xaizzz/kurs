package com.example.kurs

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.kurs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bindingClass: ActivityMainBinding
    val lostArray = arrayListOf<Int>(10000, 20000, 30000, 5000, 120, 250)
    val earnArray = arrayListOf<Int>(30000, 60000, 8000, 200, 1220, 3230)
    val resultArray = arrayListOf<String>("", "", "", "", "", "")


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        val names = resources.getStringArray(R.array.names)
        for (i in 0..5) {
            resultArray[i] = (earnArray[i] - lostArray[i]).toString() + " " + names[i]
        }
        bindingClass.button.setOnClickListener {
          when(bindingClass.edT.text.toString()){
              names[0] -> {
                  bindingClass.textView.text = resultArray[0]
              }
              names[1] -> {
                    bindingClass.textView.text = resultArray[1]
              }
              names[2] -> {
                  bindingClass.textView.text = resultArray[2]
              }
              names[3] -> {
                  bindingClass.textView.text = resultArray[3]
              }
              names[4] -> {
                  bindingClass.textView.text = resultArray[4]
              }
              names[5] -> {
                  bindingClass.textView.text = resultArray[5]
              }
              else -> {
                  bindingClass.textView.text = "Такого имени нет"}
          }




        }
    }
}
