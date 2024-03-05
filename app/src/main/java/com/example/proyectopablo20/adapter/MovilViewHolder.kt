package com.example.proyectopablo20.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.proyectopablo20.Moviles
import com.example.proyectopablo20.databinding.ItemListBinding


class MovilViewHolder(view: View) : RecyclerView.ViewHolder(view){

    val binding = ItemListBinding.bind(view)

    fun render(movilModel: Moviles, onClickListener: (Moviles) -> Unit){
        binding.tvEquipoName.text = movilModel.Nombre
        binding.tvEquipoLiga.text = movilModel.Marca
        binding.tvEquipoEstadio.text = movilModel.Tamano.toString()
        Glide.with(binding.ivEquipo.context).load(movilModel.foto).into(binding.ivEquipo)
        /*
        binding.ivEquipo.setOnClickListener{
            Toast.makeText(
                binding.ivEquipo.context,
                equipoModel.equipo,
                Toast.LENGTH_SHORT
            ).show()
        }
        itemView.setOnClickListener{
            Toast.makeText(
                binding.ivEquipo.context,
                equipoModel.estadio,
                Toast.LENGTH_SHORT
            ).show()
        }*/
        itemView.setOnClickListener{onClickListener(movilModel)}
    }
}