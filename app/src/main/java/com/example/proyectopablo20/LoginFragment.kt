package com.example.proyectopablo20

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatDelegate
import androidx.navigation.fragment.findNavController
import com.example.proyectopablo20.databinding.FragmentCosasBinding
import com.example.proyectopablo20.databinding.FragmentCositasBinding
import com.example.proyectopablo20.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
    private var _binding : FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        val root: View = binding.root


        binding.btnNavigate.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_viewPagerFragment)

        }




        return root
    }




}