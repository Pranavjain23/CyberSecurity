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
import com.csao.cybersecurity.adapter.LearnCyberCrimeRecyclerAdapter
import com.csao.cybersecurity.adapter.PreventiveTipRecyclerAdapter
import com.csao.cybersecurity.model.LearnCyberCrime
import com.csao.cybersecurity.model.PreventiveTip


class PreventiveTipFragment : Fragment() {

    lateinit var recyclerPreventiveTip : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager

    val PreventiveTipInfoList = arrayListOf<PreventiveTip>(
        PreventiveTip(""),
        PreventiveTip("")
    )
    lateinit var recyclerAdapter: PreventiveTipRecyclerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_preventive_tip, container, false)

        recyclerPreventiveTip = view.findViewById(R.id.recyclerPreventiveTip)
        layoutManager = LinearLayoutManager(activity)



        recyclerAdapter = PreventiveTipRecyclerAdapter(activity as Context, PreventiveTipInfoList)

        recyclerPreventiveTip.adapter = recyclerAdapter
        recyclerPreventiveTip.layoutManager = layoutManager

        return view
    }

}