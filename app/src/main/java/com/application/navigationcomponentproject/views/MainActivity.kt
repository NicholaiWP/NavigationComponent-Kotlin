package com.application.navigationcomponentproject.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.application.navigationcomponentproject.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigation: BottomNavigationView = findViewById(R.id.btm_nav)

        navController = findNavController(R.id.nav_host_fragment)

        bottomNavigation.setupWithNavController(navController)
       // supportActionBar?.setDisplayHomeAsUpEnabled(true)

        setupActionBar(navController)
    }

    private fun setupActionBar(navController:NavController){
        NavigationUI.setupActionBarWithNavController(this, navController)
    }


    override fun onSupportNavigateUp(): Boolean {
        navController.navigateUp()
        return super.onSupportNavigateUp()
    }


    /* pass object with transition
    override fun onClick(v: View) {
        val amountTv: EditText = view!!.findViewById(R.id.editTextAmount)
        val amount = amountTv.text.toString().toInt()
        val action = SpecifyAmountFragmentDirections.confirmationAction(amount)
        v.findNavController().navigate(action)
    }

     */
}
