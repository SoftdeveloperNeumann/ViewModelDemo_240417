package com.example.viewmodeldemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodeldemo.databinding.FragmentDataBinding


class DataFragment : Fragment() {

    lateinit var binding: FragmentDataBinding
    lateinit var model: Data

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentDataBinding.inflate(inflater, container, false)

        activity?.let { fragmentActivity ->
            model = ViewModelProvider(fragmentActivity)[Data::class.java]
            model.content.observe(fragmentActivity) { value ->
                binding.tvFragment.text = value
            }

        }


        // Inflate the layout for this fragment
        return binding.root
    }


}