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
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    private lateinit var bindingClass: ActivityMainBinding
    private lateinit var launcher: ActivityResultLauncher<Intent>
    private lateinit var launcher2: ActivityResultLauncher<Intent>


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

    }

    fun onClick(view: View) {
        if (!test()) {
            bindingClass.textView2.text = getResult()

        }
    }


    private fun test(): Boolean {
        if (bindingClass.TIETA.text.isNullOrEmpty() || bindingClass.TIETA2.text.isNullOrEmpty()) {
            bindingClass.TIETA.error = "Заполните полностью"
            bindingClass.TIETA2.error = "Заполните полностью"

        }
        return bindingClass.TIETA.text.isNullOrEmpty() || bindingClass.TIETA2.text.isNullOrEmpty()

    }
    private fun getResult(): String {
        val A: Double
        val B: Double
        bindingClass.apply {
            A = TIETA.text.toString().toDouble()
            B = TIETA2.text.toString().toDouble()
        }
        return sqrt((A * A + B * B)).toString()
    }
}
