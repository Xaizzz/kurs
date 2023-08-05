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
    private lateinit var launcher: ActivityResultLauncher<Intent>
    private lateinit var launcher2: ActivityResultLauncher<Intent>


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        launcher =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
                if (result.resultCode == RESULT_OK) {
                    val data = result.data
                }
            }

        bindingClass.bLog.setOnClickListener {
            launcher.launch(Intent(this, MainActivity2::class.java))
        }
        launcher2 =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
                if (result.resultCode == RESULT_OK) {
                    val data = result.data
                }
            }

        bindingClass.bReg.setOnClickListener {
            launcher2.launch(Intent(this, MainActivity3::class.java))
        }


    }
}
