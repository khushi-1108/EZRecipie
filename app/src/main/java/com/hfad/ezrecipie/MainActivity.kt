package com.hfad.ezrecipie

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(){
    lateinit var Next: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Next=findViewById(R.id.nextButton)
        // Show the initial welcome fragment
        showWelcomeFragment()
    }

    // Function to show the welcome fragment
    private fun showWelcomeFragment() {
        val intent = Intent(this@MainActivity, RecipeListFragment::class.java)
        startActivity(intent)
    }



}

