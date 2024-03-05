package com.example.proyectopablo20

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.proyectopablo20.databinding.FragmentCositasBinding
import com.example.proyectopablo20.databinding.FragmentFavoritosBinding
import com.example.proyectopablo20.databinding.FragmentLoginBinding


class FavoritosFragment : Fragment() {
    private var _binding: FragmentFavoritosBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFavoritosBinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.btnMenu.setOnClickListener {
            // Mostrar un Toast al hacer clic
            Toast.makeText(context, "Navegando al menú", Toast.LENGTH_SHORT).show()

            findNavController().navigate(R.id.action_favoritosFragment_to_menuFragment)
        }
        return root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}