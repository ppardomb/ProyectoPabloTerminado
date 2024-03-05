package com.example.proyectopablo20

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.proyectopablo20.databinding.FragmentCosasBinding


class CosasFragment : Fragment() {


    private var _binding : FragmentCosasBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return inflater.inflate(R.layout.fragment_about1, container, false)

        _binding = FragmentCosasBinding.inflate(inflater, container, false)

        return binding.root
    }


}