package com.example.kobit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kobit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setBinding()
    }

    private fun setBinding(){
        binding = ActivityMainBinding.inflate(layoutInflater)
    }

}