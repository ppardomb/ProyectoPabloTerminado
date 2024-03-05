package com.example.proyectopablo20

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.proyectopablo20.adapter.MovilAdapter
import com.example.proyectopablo20.databinding.FragmentRecyclerBinding


class RecyclerFragment : Fragment() {

    private var _binding: FragmentRecyclerBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentRecyclerBinding.inflate(inflater, container, false)
        initializeRecyclerView()

        binding.btnVolver.setOnClickListener {

            findNavController().navigate(R.id.action_recyclerFragment_to_menuFragment)

        }

        binding.btnFavoritos.setOnClickListener {

            findNavController().navigate(R.id.action_recyclerFragment_to_favoritosFragment)
        }

        return binding.root


    }

    fun initializeRecyclerView() {
        val manager = LinearLayoutManager(requireContext())
        binding.rMoviles.layoutManager = manager
        binding.rMoviles.adapter = MovilAdapter(MovilesProvider.listaMoviles) { movil -> onItemSelected(movil) }
    }

    fun onItemSelected(movil: Moviles) {
        Toast.makeText(requireContext(),
            movil.Nombre,
            Toast.LENGTH_SHORT
        ).show()
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}