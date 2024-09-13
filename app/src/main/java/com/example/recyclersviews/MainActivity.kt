package com.example.recyclersviews

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclersviews.adapter.superHeroeAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Llamada a la función initRecyclerView
        initRecyclerView()
    }

    private fun initRecyclerView() {
        val provider = superHeroeProvider()
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView_Heroes)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = superHeroeAdapter(provider.superHeroeList)
    }
}
