package com.example.kt5_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kt5_test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker()
    }

    private fun initClicker() {
        with(binding){
            btnCalculate.setOnClickListener {
                tvResult.text = Math().divide(etFirst.text.toString(),etSecond.text.toString())
            }
        }
    }
}