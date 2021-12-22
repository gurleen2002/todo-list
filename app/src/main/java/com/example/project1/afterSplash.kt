package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class afterSplash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_splash)
        val array = arrayOf("Item 1", "Item 2", "Item 3")
        val recyclerView = findViewById<RecyclerView>(R.id.recycler)
        var adapter = CheckBoxAdapter(array)
        recyclerView.adapter = adapter
    }
    fun click(checkView: View){
        val recyclerView = findViewById<RecyclerView>(R.id.recycler)
        val adapter = recyclerView.adapter as CheckBoxAdapter
        val size = adapter.itemCount

        adapter.addToList("Item ${size+1}")
        adapter.notifyItemInserted(size)
    }
}