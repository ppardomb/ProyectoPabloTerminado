package com.example.proyectopablo20

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.proyectopablo20.databinding.FragmentDetailItemBinding


class DetailItemFragment : Fragment() {

    private var _binding: FragmentDetailItemBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding=FragmentDetailItemBinding.inflate(inflater,container,false)
        val itemId = arguments?.getInt("itemId")
        val movil = MovilesProvider.listaMoviles.find { it.id==itemId }
        if (movil!=null){
            binding.buttonVolv.setOnClickListener {

                findNavController().navigate(R.id.action_detailItemFragment_to_recyclerFragment)
            }
            binding.tvEquipoName.text=movil.Nombre
            binding.tvEquipoLiga.text=movil.Marca
            binding.tvEquipoEstadio.text=movil.Tamano
            Glide.with(binding.ivEquipo.context).load(movil.foto).into(binding.ivEquipo)

        }



        return binding.root

    }


}