package com.example.chapter3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter3.databinding.ActivityTigaBinding


@Suppress("DEPRECATION")
class ActivityTiga : AppCompatActivity() {
    lateinit var binding : ActivityTigaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTigaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getParcelable()

    }

    fun getBundle(){
        val getBundle = intent.extras
        val namaa = getBundle?.getString("nama")
        binding.txtBundle.text = namaa
    }

    fun getSerializable(){
        val person = intent.getSerializableExtra("dataPerson") as Person
        val namaPerson = person.name
        binding.txtSerializable.text = namaPerson
    }

    fun getParcelable(){
        val dataOrangg = intent.getParcelableExtra<OrangParcelable>("dataOrang")
        binding.txtParcelable.text = dataOrangg?.nama ?: "null"
    }
}