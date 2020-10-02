package com.csao.cybersecurity.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.csao.cybersecurity.R
import com.csao.cybersecurity.activity.MainActivity
import com.csao.cybersecurity.adapter.HelplineNumberRecyclerAdapter
import com.csao.cybersecurity.adapter.PreventiveTipRecyclerAdapter
import com.csao.cybersecurity.model.HelplineNumber
import com.csao.cybersecurity.model.PreventiveTip


class HelplineNumberFragment : Fragment() {

    lateinit var recyclerHelplineNumber : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager

    val HelplineNumberInfoList = arrayListOf<HelplineNumber>(
        HelplineNumber("helpline@cyberpeace.net","9570000066"),
        HelplineNumber("ANDAMAN & NICOBAR","03192230216"),
        HelplineNumber("ANDHRA PRADESH","08632340152"),
        HelplineNumber("Arunachal Pradesh","03602215518"),
        HelplineNumber("ASSAM","03612524494"),
        HelplineNumber("Bihar","06122238098"),
        HelplineNumber("Chandigarh","01722760001"),
        HelplineNumber("Chhattisgarh","07712511623"),
        HelplineNumber("DADRA & NAGAR HAVELI","02602643022"),
        HelplineNumber("DAMAN & DIU","02602250942"),
        HelplineNumber("DELHI","01120892633"),
        HelplineNumber("Goa","08322420883"),
        HelplineNumber("GUJARAT","07923250798"),
        HelplineNumber("HARYANA","01733253230"),
        HelplineNumber("Himachal Pradesh","01772627955"),
        HelplineNumber("JAMMU & KASHMIR","01912582996"),
        HelplineNumber("Jharkhand","06512490046"),
        HelplineNumber("Karnataka","08022251817"),
        HelplineNumber("Kerala","04712722215"),
        HelplineNumber("Lakshadweep","04896262258"),
        HelplineNumber("Madhya Pradesh","07552770248"),
        HelplineNumber("MAHARASHTRA","02222160080"),
        HelplineNumber("Manipur","03852450573"),
        HelplineNumber("Meghalaya","03642550141"),
        HelplineNumber("Mizoram","03892334682"),
        HelplineNumber("Nagaland","03702223897"),
        HelplineNumber("ODISHA","06712306071"),
        HelplineNumber("Puducherry","04132231386"),
        HelplineNumber("Punjab","01722226258"),
        HelplineNumber("RAJASTHAN","01412309547"),
        HelplineNumber("Sikkim","03592204297"),
        HelplineNumber("TAMIL NADU","04428447712"),
        HelplineNumber("TAMIL NADU","04428447620"),
        HelplineNumber("Telangana","04023147604"),
        HelplineNumber("Tripura","03812321741"),
        HelplineNumber("UTTARAKHAND","01352712563"),
        HelplineNumber("UTTAR PRADESH","05222208598"),
        HelplineNumber("West Bengal","03324791830")
    )

    lateinit var recyclerAdapter: HelplineNumberRecyclerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_helpline_number, container, false)

        getActionBar()?.setTitle("Helpline Number");
        recyclerHelplineNumber = view.findViewById(R.id.recyclerHelplineNumber)
        layoutManager = LinearLayoutManager(activity)



        recyclerAdapter = HelplineNumberRecyclerAdapter(activity as Context, HelplineNumberInfoList)

        recyclerHelplineNumber.adapter = recyclerAdapter
        recyclerHelplineNumber.layoutManager = layoutManager

        return view
    }
    private fun getActionBar(): androidx.appcompat.app.ActionBar? {
        return (activity as MainActivity).supportActionBar
    }


}