package com.geektech.weatherappkotlin.presentation.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import com.geektech.weatherappkotlin.R
import com.geektech.weatherappkotlin.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private val binding by viewBinding(ActivityMainBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setupNavigation()
    }

    /*  private fun setupNavigation() {
          val navHostFragment =
              supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
          val navController = navHostFragment.navController
      }*/
}