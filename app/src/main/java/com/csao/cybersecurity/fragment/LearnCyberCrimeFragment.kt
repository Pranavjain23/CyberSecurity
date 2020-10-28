package com.csao.cybersecurity.fragment

import android.app.ActionBar
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.csao.cybersecurity.R
import com.csao.cybersecurity.activity.MainActivity
import com.csao.cybersecurity.adapter.LearnCyberCrimeRecyclerAdapter
import com.csao.cybersecurity.model.LearnCyberCrime


class LearnCyberCrimeFragment : Fragment() {


    lateinit var recyclerLearnCyberCrime: RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager


    lateinit var recyclerAdapter: LearnCyberCrimeRecyclerAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_learn_cyber_crime, container, false)

        val LearnCyberCrimeInfoList = arrayListOf<LearnCyberCrime>(

            LearnCyberCrime(getString(R.string.lcc1)),
            LearnCyberCrime(getString(R.string.lcc2)),
            LearnCyberCrime(getString(R.string.lcc3)),
            LearnCyberCrime(getString(R.string.lcc4)),
            LearnCyberCrime(getString(R.string.lcc5)),
            LearnCyberCrime(getString(R.string.lcc6)),
            LearnCyberCrime(getString(R.string.lcc7)),
            LearnCyberCrime(getString(R.string.lcc8)),
            LearnCyberCrime(getString(R.string.lcc9)),
            LearnCyberCrime(getString(R.string.lcc10)),
            LearnCyberCrime(getString(R.string.lcc11)),
            LearnCyberCrime(getString(R.string.lcc12)),
            LearnCyberCrime(getString(R.string.lcc13)),
            LearnCyberCrime(getString(R.string.lcc14)),
            LearnCyberCrime(getString(R.string.lcc15)),
            LearnCyberCrime(getString(R.string.lcc16)),
            LearnCyberCrime(getString(R.string.lcc17)),
            LearnCyberCrime(getString(R.string.lcc18)),
            LearnCyberCrime(getString(R.string.lcc19)),
            LearnCyberCrime(getString(R.string.lcc20)),
            LearnCyberCrime(getString(R.string.lcc21)),
            LearnCyberCrime(getString(R.string.lcc22)),
            LearnCyberCrime(getString(R.string.lcc23)),
            LearnCyberCrime(getString(R.string.lcc24))

        )

        getActionBar()?.setTitle(getString(R.string.lcc));
        recyclerLearnCyberCrime = view.findViewById(R.id.recyclerLearnCyberCrime)
        layoutManager = LinearLayoutManager(activity)

        recyclerAdapter = LearnCyberCrimeRecyclerAdapter(activity as Context, LearnCyberCrimeInfoList)

        recyclerLearnCyberCrime.adapter = recyclerAdapter
        recyclerLearnCyberCrime.layoutManager = layoutManager

        return view
    }

    private fun getActionBar(): androidx.appcompat.app.ActionBar? {
        return (activity as MainActivity).supportActionBar
    }

}
