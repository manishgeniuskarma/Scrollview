package com.example.scrollview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.scrollview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
  lateinit var  binding: ActivityMainBinding
    lateinit var navcontroller:NavController
    lateinit var drawerlayout:DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        @Suppress("UNUSED_VARIABLE")
        //setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        drawerlayout= binding.drawerlayout

        navcontroller= this.findNavController(R.id.myNavHostFragment)
        NavigationUI.setupActionBarWithNavController(this,navcontroller)
        NavigationUI.setupWithNavController(binding.Navview,navcontroller)
        NavigationUI.setupActionBarWithNavController(this,navcontroller,drawerlayout)
    }

    override fun onSupportNavigateUp(): Boolean {

        return NavigationUI.navigateUp(navcontroller,drawerlayout)
    }
}