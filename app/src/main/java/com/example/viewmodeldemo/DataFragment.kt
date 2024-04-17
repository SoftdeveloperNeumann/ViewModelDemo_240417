package com.example.viewmodeldemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewmodeldemo.databinding.FragmentDataBinding


class DataFragment : Fragment() {

    lateinit var binding: FragmentDataBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentDataBinding.inflate(inflater,container,false)

        // Inflate the layout for this fragment
        return binding.root
    }


}