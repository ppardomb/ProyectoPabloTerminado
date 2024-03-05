package com.example.proyectopablo20

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.proyectopablo20.databinding.FragmentCreditBinding
import com.example.proyectopablo20.databinding.FragmentMenuBinding


class MenuFragment : Fragment() {

    private var _binding: FragmentMenuBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMenuBinding.inflate(inflater, container, false)
        val root = binding.root

        binding.btnSalir.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_loginFragment)
        }

        binding.btnCreditos.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_creditFragment)
        }

        binding.btnLista.setOnClickListener {

            findNavController().navigate(R.id.action_menuFragment_to_recyclerFragment)
        }

        return root
    }






}