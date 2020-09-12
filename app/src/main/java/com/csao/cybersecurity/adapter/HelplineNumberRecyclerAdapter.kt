package com.csao.cybersecurity.adapter

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.csao.cybersecurity.R
import com.csao.cybersecurity.model.HelplineNumber
import com.csao.cybersecurity.model.PreventiveTip

class HelplineNumberRecyclerAdapter (val context: Context, val itemList: ArrayList<HelplineNumber>) : RecyclerView.Adapter<HelplineNumberRecyclerAdapter.HelplineNumberViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HelplineNumberViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_helpline_number_single_row,parent,false)

        return HelplineNumberViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: HelplineNumberViewHolder, position: Int) {
        val helplineNumber = itemList[position]
        holder.txtStateName.text = helplineNumber.stateName
        holder.btnContactNumber.text = helplineNumber.contactNumber

        holder.btnContactNumber.setOnClickListener {
            var u : Uri = Uri.parse("tel: "+holder.btnContactNumber.text)
            val intent = Intent(Intent.ACTION_DIAL,u)
            try
            {
                context.startActivity(intent);
            }
            catch ( s:SecurityException)
            {
                Toast.makeText(context, "Can not copy to dialer", Toast.LENGTH_LONG).show()
            }
        }

    }
    class HelplineNumberViewHolder(view: View) : RecyclerView.ViewHolder(view){

        var txtStateName : TextView = view.findViewById(R.id.txtStateName)
        var btnContactNumber : Button = view.findViewById(R.id.btnContactNumber)

        var llContentHN: LinearLayout = view.findViewById(R.id.llContentHN)


    }

}