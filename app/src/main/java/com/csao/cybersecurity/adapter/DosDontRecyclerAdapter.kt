package com.csao.cybersecurity.adapter

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.provider.Settings
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.csao.cybersecurity.R
import com.csao.cybersecurity.model.DosAndDont


class DosDontRecyclerAdapter(val context: Context, val itemList: ArrayList<DosAndDont>) : RecyclerView.Adapter<DosDontRecyclerAdapter.DoDontViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoDontViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_dosdont_single_row,parent,false)

        return DoDontViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: DoDontViewHolder, position: Int) {
        val doAndDont = itemList[position]
        holder.txtDetail.text = doAndDont.dosAndDontName
        holder.imgDoAndDont.setImageResource(doAndDont.DosAndDontImage)

        //holder.linearLayout.setOnClickListener {
         //   Toast.makeText(context, "List item is selected! ", Toast.LENGTH_SHORT).show()

       // }
    }
    class DoDontViewHolder(view: View) : RecyclerView.ViewHolder(view){

        var txtDetail:TextView = view.findViewById(R.id.txtDetail)
        var imgDoAndDont:ImageView = view.findViewById(R.id.imgDoAndDont)

        var linearLayout:LinearLayout = view.findViewById(R.id.linearLayout)

    }

}