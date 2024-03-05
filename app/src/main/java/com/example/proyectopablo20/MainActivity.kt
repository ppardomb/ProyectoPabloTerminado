package com.example.proyectopablo20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.example.proyectopablo20.databinding.ActivityMainBinding
import com.example.proyectopablo20.databinding.FragmentLoginBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        val navController = navHostFragment.navController



        navController.addOnDestinationChangedListener { _, destination, _ ->
            if(destination.id == R.id.loginFragment) {
                binding.buttonNavigation.visibility = View.GONE
            } else {
                binding.buttonNavigation.visibility = View.VISIBLE
            }
        }
        setContentView( binding.root)

        binding.buttonNavigation.setupWithNavController(navController)

        NavigationUI.setupActionBarWithNavController(this, navController)
    }

    override fun onSupportNavigateUp(): Boolean {

        val navController = this.findNavController(R.id.navHostFragment)

        return navController.navigateUp()

    }



}