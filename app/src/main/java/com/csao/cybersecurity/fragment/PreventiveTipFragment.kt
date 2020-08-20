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
import com.csao.cybersecurity.adapter.LearnCyberCrimeRecyclerAdapter
import com.csao.cybersecurity.adapter.PreventiveTipRecyclerAdapter
import com.csao.cybersecurity.model.LearnCyberCrime
import com.csao.cybersecurity.model.PreventiveTip


class PreventiveTipFragment : Fragment() {

    lateinit var recyclerPreventiveTip : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager

    val PreventiveTipInfoList = arrayListOf<PreventiveTip>(
        PreventiveTip("Clicking without Thinking Is Reckless"),
        PreventiveTip("Stick to your own devices"),
        PreventiveTip("Be aware of your surroundings"),
        PreventiveTip("Keep track of your digital footprint"),
        PreventiveTip("Keep up with Updates"),
        PreventiveTip("Back Up Your Data"),
        PreventiveTip("Keep Your Privacy Settings On"),
        PreventiveTip("Be Careful What You Download"),
        PreventiveTip("Make Online Purchases From Secure Sites"),
        PreventiveTip("Use Strong Passwords"),
        PreventiveTip("Secure your computer"),
        PreventiveTip("Keep Your Antivirus Program Up To Date"),
        PreventiveTip("Be Social-Media Savvy"),
        PreventiveTip("Secure your Mobile Devices"),
        PreventiveTip("Protect your Data")
    )
    lateinit var recyclerAdapter: PreventiveTipRecyclerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_preventive_tip, container, false)

        getActionBar()?.setTitle("Preventive Tips");

        recyclerPreventiveTip = view.findViewById(R.id.recyclerPreventiveTip)
        layoutManager = LinearLayoutManager(activity)



        recyclerAdapter = PreventiveTipRecyclerAdapter(activity as Context, PreventiveTipInfoList)

        recyclerPreventiveTip.adapter = recyclerAdapter
        recyclerPreventiveTip.layoutManager = layoutManager

        return view
    }
    private fun getActionBar(): androidx.appcompat.app.ActionBar? {
        return (activity as MainActivity).supportActionBar
    }
}