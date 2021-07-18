package com.arun.androidtutsforu.demonavgraphtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.arun.androidtutsforu.demonavgraphtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var score =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btPlay.setOnClickListener {
            binding.tvScore.text = (score++).toString()
        }

    }
}