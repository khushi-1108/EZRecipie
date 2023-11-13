package com.hfad.ezrecipie

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager


class RecipeListFragment : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_recipie_list)
        val next = findViewById<Button>(R.id.recipeButton)
        next.setOnClickListener {
            val intent = Intent(this@RecipeListFragment, RecipeDetailsFragment::class.java)
            startActivity(intent)
        }


    }
}