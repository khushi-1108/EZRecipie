package com.hfad.ezrecipie

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.activity.ComponentActivity


class WelcomeFragment : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_welcome)
        val next = findViewById<Button>(R.id.nextButton)
        next.setOnClickListener {
        val intent= Intent(this@WelcomeFragment, RecipeListFragment::class.java)
            startActivity(intent)

        }

    }
}

