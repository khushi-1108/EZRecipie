package com.hfad.ezrecipie
import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.core.view.KeyEventDispatcher.Component
import androidx.fragment.app.Fragment
import com.hfad.ezrecipie.R
//import kotlinx.android.synthetic.main.recipe_details.*

class RecipeDetailsFragment : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_welcome)
        val next=findViewById<Button>(R.id.nextButton)
        next.setOnClickListener{
            finish()
        }
    }
}
