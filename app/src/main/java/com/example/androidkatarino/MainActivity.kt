package com.example.androidkatarino

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : ComponentActivity() {


  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContentView(R.layout.activity_main)

    val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
    recyclerView.adapter = ReceiptsAdapter(data)
  }
}


