package com.example.chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter3.databinding.ActivityMainFragmentBinding

class MainActivityFragment : AppCompatActivity() {
    private lateinit var binding:ActivityMainFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSatu.setOnClickListener {
            val fragment = FragmentSatu()
            supportFragmentManager.beginTransaction().add(R.id.fragment_holder, fragment).commit()
        }

        binding.btnDua.setOnClickListener {
            val fragment = FragmentDua()
            supportFragmentManager.beginTransaction().add(R.id.fragment_holder,fragment).commit()
        }
    }


}