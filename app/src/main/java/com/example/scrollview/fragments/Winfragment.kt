package com.example.scrollview.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.scrollview.R
import com.example.scrollview.databinding.FragmentQuizoverBinding
import com.example.scrollview.databinding.FragmentWinfragmentBinding


class Winfragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
    val binding = DataBindingUtil.inflate<FragmentWinfragmentBinding>(inflater,R.layout.fragment_winfragment,container,false)
       binding.retake.setOnClickListener {

           it.findNavController().navigate(R.id.action_winfragment_to_quizfragment)
       }

        return binding.root
    }


    }
