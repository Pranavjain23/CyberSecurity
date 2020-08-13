package com.csao.cybersecurity.adapter

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.csao.cybersecurity.R
import com.csao.cybersecurity.model.LearnCyberCrime

class LearnCyberCrimeRecyclerAdapter(val context: Context, val itemList: ArrayList<LearnCyberCrime>) : RecyclerView.Adapter<LearnCyberCrimeRecyclerAdapter.LearnCyberCrimeViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LearnCyberCrimeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_learn_cyber_crime_single_row,parent,false)

        return LearnCyberCrimeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: LearnCyberCrimeViewHolder, position: Int) {
        val learnCyberCrime = itemList[position]
        holder.txtCyberCrimeHeader.text = learnCyberCrime.learncyberCrimeName


        holder.llContentLCC.setOnClickListener {

            val myDialog = AlertDialog.Builder(context)
            myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
            myDialog.setMessage("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pretium tellus maximus, condimentum ante in, porta lectus. Morbi egestas orci ac erat dignissim, sed aliquet ex sagittis. Cras rhoncus aliquet libero, et posuere nibh pulvinar sit amet. Mauris posuere, nisl in feugiat suscipit, eros magna convallis velit, sed fermentum erat felis at enim. Vivamus in ipsum in lacus semper ultricies. Cras sed elit elit. Praesent lobortis justo ex, in blandit mi condimentum non. Pellentesque luctus neque id libero molestie ultrices. Maecenas fringilla urna ante, in fringilla justo pharetra id. Mauris molestie venenatis massa, eget pellentesque eros sollicitudin eget. Aliquam ut tristique mauris. Integer vulputate magna sapien, sed gravida lacus dignissim sed. Phasellus auctor tincidunt nisl vitae accumsan.")
            myDialog.setNegativeButton("Ok"){text, which ->
                Toast.makeText(context,"clicked OK",Toast.LENGTH_LONG).show()
            }
            myDialog.create()
            myDialog.show()
        }
    }
    class LearnCyberCrimeViewHolder(view: View) : RecyclerView.ViewHolder(view){

        var txtCyberCrimeHeader: TextView = view.findViewById(R.id.txtCyberCrimeHeader)

        var llContentLCC: LinearLayout = view.findViewById(R.id.llContentLCC)


    }

}