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
            if(position==0){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage(context.getString(R.string.dlcc1))
                myDialog.setNegativeButton(context.getString(R.string.ok)){ text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==1){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage(context.getString(R.string.dlcc2))
                myDialog.setNegativeButton(context.getString(R.string.ok)){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==2){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage(context.getString(R.string.dlcc3))
                myDialog.setNegativeButton(context.getString(R.string.ok)){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==3){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage(context.getString(R.string.dlcc4))
                myDialog.setNegativeButton(context.getString(R.string.ok)){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==4){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage(context.getString(R.string.dlcc5))
                myDialog.setNegativeButton(context.getString(R.string.ok)){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==5){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage(context.getString(R.string.dlcc6))
                myDialog.setNegativeButton(context.getString(R.string.ok)){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==6){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage(context.getString(R.string.dlcc7))
                myDialog.setNegativeButton("Ok"){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==7){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage(context.getString(R.string.dlcc8))
                myDialog.setNegativeButton(context.getString(R.string.ok)){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==8){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage(context.getString(R.string.dlcc9))
                myDialog.setNegativeButton(context.getString(R.string.ok)){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==9){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage(context.getString(R.string.dlcc10))
                myDialog.setNegativeButton(context.getString(R.string.ok)){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==10){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage(context.getString(R.string.dlcc11))
                myDialog.setNegativeButton(context.getString(R.string.ok)){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==11){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage(context.getString(R.string.dlcc12))
                myDialog.setNegativeButton(context.getString(R.string.ok)){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==12){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage(context.getString(R.string.dlcc13))
                myDialog.setNegativeButton(context.getString(R.string.ok)){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==13){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage(context.getString(R.string.dlcc14))
                myDialog.setNegativeButton(context.getString(R.string.ok)){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==14){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage(context.getString(R.string.dlcc15))
                myDialog.setNegativeButton(context.getString(R.string.ok)){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==15){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage(context.getString(R.string.dlcc16))
                myDialog.setNegativeButton(context.getString(R.string.ok)){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==16){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage(context.getString(R.string.dlcc17))
                myDialog.setNegativeButton(context.getString(R.string.ok)){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==17){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage(context.getString(R.string.dlcc18))
                myDialog.setNegativeButton(context.getString(R.string.ok)){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==18){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage(context.getString(R.string.dlcc19))
                myDialog.setNegativeButton(context.getString(R.string.ok)){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==19){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage(context.getString(R.string.dlcc20))
                myDialog.setNegativeButton(context.getString(R.string.ok)){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==20){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage(context.getString(R.string.dlcc21))
                myDialog.setNegativeButton(context.getString(R.string.ok)){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==21){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage(context.getString(R.string.dlcc22))
                myDialog.setNegativeButton(context.getString(R.string.ok)){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==22){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage(context.getString(R.string.dlcc23))
                myDialog.setNegativeButton(context.getString(R.string.ok)){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==23){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage(context.getString(R.string.dlcc24))
                myDialog.setNegativeButton(context.getString(R.string.ok)){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }

        }
    }
    class LearnCyberCrimeViewHolder(view: View) : RecyclerView.ViewHolder(view){

        var txtCyberCrimeHeader: TextView = view.findViewById(R.id.txtCyberCrimeHeader)

        var llContentLCC: LinearLayout = view.findViewById(R.id.llContentLCC)


    }

}