
package com.example.proyectopablo20.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.proyectopablo20.CosasFragment
import com.example.proyectopablo20.CositasFragment
import java.lang.IllegalArgumentException

class ViewPagerAdapter(fa:FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int=2
    override fun createFragment(position: Int): Fragment {
        return when (position){

             0 -> CosasFragment()
             1 -> CositasFragment()

            else -> throw IllegalArgumentException("Posicion invalida: $position")

        }
    }
}

