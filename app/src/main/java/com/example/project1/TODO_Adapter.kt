package com.example.project1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.recyclerview.widget.RecyclerView

class CheckBoxAdapter(private val dataSet: Array<String>) :
    RecyclerView.Adapter<CheckBoxAdapter.CheckBoxViewHolder>() {

    val arr:MutableList<String> = dataSet.toMutableList()

    class CheckBoxViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val checkBoxView: CheckBox

        init {
            checkBoxView = view.findViewById(R.id.check)
        }
    }

    fun addToList(str : String) {
        arr.add(str)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): CheckBoxViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.checkboxes, viewGroup, false)

        return CheckBoxViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: CheckBoxViewHolder, position: Int) {
        viewHolder.checkBoxView.text = arr[position]
    }

    override fun getItemCount() = arr.size
    }
