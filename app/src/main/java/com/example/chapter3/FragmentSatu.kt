package com.example.chapter3

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.chapter3.databinding.FragmentDuaBinding


class FragmentSatu : Fragment() {
    val TAG = "Fragment Satu"
    private lateinit var binding:FragmentDuaBinding

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "OnAttach aktif")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDuaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }






}