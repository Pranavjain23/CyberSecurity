package com.csao.cybersecurity.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.csao.cybersecurity.R
import com.csao.cybersecurity.model.PreventiveTip

class PreventiveTipRecyclerAdapter(val context: Context, val itemList: ArrayList<PreventiveTip>) : RecyclerView.Adapter<PreventiveTipRecyclerAdapter.PreventiveTipViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PreventiveTipViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_preventive_tip_single_row,parent,false)

        return PreventiveTipViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: PreventiveTipViewHolder, position: Int) {
        val preventiveTip = itemList[position]
        holder.txtPreventiveTipHeader.text = preventiveTip.preventiveTipName


    }
    class PreventiveTipViewHolder(view: View) : RecyclerView.ViewHolder(view){

        var txtPreventiveTipHeader: TextView = view.findViewById(R.id.txtPreventiveTip)

        var llContentPT: LinearLayout = view.findViewById(R.id.llContentPT)


    }

}