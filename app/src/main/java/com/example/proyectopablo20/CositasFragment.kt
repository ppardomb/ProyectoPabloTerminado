package com.example.proyectopablo20

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.proyectopablo20.databinding.FragmentCositasBinding
import com.example.proyectopablo20.databinding.FragmentLoginBinding




class CositasFragment : Fragment() {

    private var _binding: FragmentCositasBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCositasBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Set click listener for the button using binding
        binding.btnMenu.setOnClickListener {
            findNavController().navigate(R.id.action_viewPagerFragment_to_menuFragment)
        }

        return root // Return the root view from binding
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    private fun closeFragment() {
        requireActivity().supportFragmentManager.popBackStack()
    }
}
