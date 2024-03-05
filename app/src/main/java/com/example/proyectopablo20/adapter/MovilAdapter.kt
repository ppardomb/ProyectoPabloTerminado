package com.example.proyectopablo20.adapter




import android.content.DialogInterface.OnClickListener
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectopablo20.Moviles
import com.example.proyectopablo20.R


class MovilAdapter(private val movilesLista:List<Moviles>, private val onClickListener: (Moviles) -> Unit) : RecyclerView.Adapter<MovilViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovilViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MovilViewHolder(layoutInflater.inflate(R.layout.item_list,parent,false))
    }

    override fun getItemCount(): Int = movilesLista.size

    override fun onBindViewHolder(holder: MovilViewHolder, position: Int) {
        holder.render(movilesLista[position], onClickListener)
        holder.binding.buttonDetalles.setOnClickListener {
            val itemId = movilesLista[holder.adapterPosition].id

            val bundle = bundleOf("itemId" to itemId)
            it.findNavController().navigate(R.id.action_recyclerFragment_to_detailItemFragment, bundle)

        }

    }

}