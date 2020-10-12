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



    lateinit var recyclerAdapter: HelplineNumberRecyclerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_helpline_number, container, false)

        val HelplineNumberInfoList = arrayListOf<HelplineNumber>(
            HelplineNumber(getString(R.string.cyberpeacehelpline),"9570000066"),
            HelplineNumber(getString(R.string.state1),"03192230216"),
            HelplineNumber(getString(R.string.state2),"08632340152"),
            HelplineNumber(getString(R.string.state3),"03602215518"),
            HelplineNumber(getString(R.string.state4),"03612524494"),
            HelplineNumber(getString(R.string.state5),"06122238098"),
            HelplineNumber(getString(R.string.state6),"01722760001"),
            HelplineNumber(getString(R.string.state7),"07712511623"),
            HelplineNumber(getString(R.string.state8),"02602643022"),
            HelplineNumber(getString(R.string.state9),"02602250942"),
            HelplineNumber(getString(R.string.state10),"01120892633"),
            HelplineNumber(getString(R.string.state11),"08322420883"),
            HelplineNumber(getString(R.string.state12),"07923250798"),
            HelplineNumber(getString(R.string.state13),"01733253230"),
            HelplineNumber(getString(R.string.state14),"01772627955"),
            HelplineNumber(getString(R.string.state15),"01912582996"),
            HelplineNumber(getString(R.string.state16),"06512490046"),
            HelplineNumber(getString(R.string.state17),"08022251817"),
            HelplineNumber(getString(R.string.state18),"04712722215"),
            HelplineNumber(getString(R.string.state19),"04896262258"),
            HelplineNumber(getString(R.string.state20),"07552770248"),
            HelplineNumber(getString(R.string.state21),"02222160080"),
            HelplineNumber(getString(R.string.state22),"03852450573"),
            HelplineNumber(getString(R.string.state23),"03642550141"),
            HelplineNumber(getString(R.string.state24),"03892334682"),
            HelplineNumber(getString(R.string.state25),"03702223897"),
            HelplineNumber(getString(R.string.state26),"06712306071"),
            HelplineNumber(getString(R.string.state27),"04132231386"),
            HelplineNumber(getString(R.string.state28),"01722226258"),
            HelplineNumber(getString(R.string.state29),"01412309547"),
            HelplineNumber(getString(R.string.state30),"03592204297"),
            HelplineNumber(getString(R.string.state31),"04428447712"),
            HelplineNumber(getString(R.string.state32),"04428447620"),
            HelplineNumber(getString(R.string.state33),"04023147604"),
            HelplineNumber(getString(R.string.state34),"03812321741"),
            HelplineNumber(getString(R.string.state35),"01352712563"),
            HelplineNumber(getString(R.string.state36),"05222208598"),
            HelplineNumber(getString(R.string.state37),"03324791830")
        )

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