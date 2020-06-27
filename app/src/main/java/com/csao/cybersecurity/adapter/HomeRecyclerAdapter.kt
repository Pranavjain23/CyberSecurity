package com.csao.cybersecurity.adapter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.csao.cybersecurity.R
import com.csao.cybersecurity.activity.*
import com.csao.cybersecurity.fragment.LearnCyberCrimeFragment
import com.csao.cybersecurity.model.Home
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.recycler_home_single_row.view.*

class HomeRecyclerAdapter (val context: Context, val itemList: ArrayList<Home>): RecyclerView.Adapter<HomeRecyclerAdapter.HomeViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_home_single_row,parent,false)

        return HomeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val home = itemList[position]
        holder.txtHomeHeader.text = home.homeHeaderName
        holder.imgHomeHeader.setImageResource(home.homeHeaderImage)


        holder.llContent.setOnClickListener {
            if(position==0){
                val intent = Intent(context , SecurityCheckActivity::class.java)
                context.startActivity(intent)
            }
            else if(position==1){
                val fragment = LearnCyberCrimeFragment()
                val args = Bundle()
                fragment.arguments = args
                (context as MainActivity).supportFragmentManager.beginTransaction()
                    .replace(
                        R.id.frame,
                        fragment
                    ).commit()

            }
            else if(position==2){
                val intent = Intent(context , CyberComplaintActivity::class.java)
                context.startActivity(intent)
            }
            else if(position==3){
                val intent = Intent(context , PreventiveActivity::class.java)
                context.startActivity(intent)
            }
            else if(position==4){
                val intent = Intent(context , HelplineActivity::class.java)
                context.startActivity(intent)
            }

        }

    }

    class HomeViewHolder(view: View) : RecyclerView.ViewHolder(view){

        val txtHomeHeader: TextView = view.findViewById(R.id.txtHomeHeader)
        val imgHomeHeader: ImageView = view.findViewById(R.id.imgHomeHeader)
        val llContent : LinearLayout = view.findViewById(R.id.llContent)
    }

}