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


    lateinit var recyclerAdapter: PreventiveTipRecyclerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_preventive_tip, container, false)

        val PreventiveTipInfoList = arrayListOf<PreventiveTip>(
            PreventiveTip(getString(R.string.pt1)),
            PreventiveTip(getString(R.string.pt2)),
            PreventiveTip(getString(R.string.pt3)),
            PreventiveTip(getString(R.string.pt4)),
            PreventiveTip(getString(R.string.pt5)),
            PreventiveTip(getString(R.string.pt6)),
            PreventiveTip(getString(R.string.pt7)),
            PreventiveTip(getString(R.string.pt8)),
            PreventiveTip(getString(R.string.pt9)),
            PreventiveTip(getString(R.string.pt10)),
            PreventiveTip(getString(R.string.pt11)),
            PreventiveTip(getString(R.string.pt12)),
            PreventiveTip(getString(R.string.pt13)),
            PreventiveTip(getString(R.string.pt14)),
            PreventiveTip(getString(R.string.pt15))
        )

        getActionBar()?.setTitle(getString(R.string.preventivetips));

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