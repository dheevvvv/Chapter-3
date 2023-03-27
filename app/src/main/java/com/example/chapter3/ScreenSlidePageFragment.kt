package com.example.chapter3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.chapter3.databinding.FragmentScreenSlidePageBinding


class ScreenSlidePageFragment : Fragment() {

    private lateinit var binding: FragmentScreenSlidePageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentScreenSlidePageBinding.inflate(layoutInflater, container, false)
        return binding.root
    }



}