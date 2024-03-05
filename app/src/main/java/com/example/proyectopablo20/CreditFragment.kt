package com.example.proyectopablo20

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class CreditFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root =inflater.inflate(R.layout.fragment_credit, container, false)
        val btnVolver = root.findViewById<Button>(R.id.btnVolver)

        btnVolver.setOnClickListener {

            findNavController().navigate(R.id.action_creditFragment_to_menuFragment)
        }


        return root
    }


}