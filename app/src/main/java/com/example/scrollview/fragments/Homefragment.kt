package com.example.scrollview.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.scrollview.R
import com.example.scrollview.databinding.FragmentHomefragmentBinding


class Homefragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentHomefragmentBinding>(inflater,R.layout.fragment_homefragment,container,false)
  binding.play.setOnClickListener {

      it.findNavController().navigate(R.id.action_homefragment_to_quizfragment)
  }
     return  binding.root

    }
}