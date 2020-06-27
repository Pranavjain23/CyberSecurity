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
import com.csao.cybersecurity.adapter.DosDontRecyclerAdapter
import com.csao.cybersecurity.adapter.LearnCyberCrimeRecyclerAdapter
import com.csao.cybersecurity.model.LearnCyberCrime
import kotlinx.android.synthetic.main.activity_main.*


class LearnCyberCrimeFragment : Fragment() {


    lateinit var recyclerLearnCyberCrime: RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager

    val LearnCyberCrimeInfoList = arrayListOf<LearnCyberCrime>(
        LearnCyberCrime("CHILD PORNOGRAPHY/ CHILD SEXUALLY ABUSIVE MATERIAL (CSAM)"),
        LearnCyberCrime("CYBER BULLYING"),
        LearnCyberCrime("CYBER STALKING"),
        LearnCyberCrime("CYBER GROOMING"),
        LearnCyberCrime("ONLINE JOB FRAUD"),
        LearnCyberCrime("ONLINE SEXTORTION"),
        LearnCyberCrime("VISHING"),
        LearnCyberCrime("SEXTING"),
        LearnCyberCrime("SMSHING"),
        LearnCyberCrime("SIM SWAP SCAM"),
        LearnCyberCrime("DEBIT/CREDIT CARD FRAUD"),
        LearnCyberCrime("IMPERSONATION AND IDENTITY THEFT"),
        LearnCyberCrime("PHISHING"),
        LearnCyberCrime("SPAMMING"),
        LearnCyberCrime("RANSOMWARE"),
        LearnCyberCrime("VIRUS, WORMS & TROJANS"),
        LearnCyberCrime("DATA BREACH"),
        LearnCyberCrime("DENIAL OF SERVICES /DISTRIBUTED DOS"),
        LearnCyberCrime("WEBSITE DEFACEMENT"),
        LearnCyberCrime("CYBER-SQUATTING"),
        LearnCyberCrime("PHARMING"),
        LearnCyberCrime("CRYPTOJACKING"),
        LearnCyberCrime("ONLINE DRUG TRAFFICKING"),
        LearnCyberCrime("ESPIONAGE")

    )
    lateinit var recyclerAdapter: LearnCyberCrimeRecyclerAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_learn_cyber_crime, container, false)

        recyclerLearnCyberCrime = view.findViewById(R.id.recyclerLearnCyberCrime)
        layoutManager = LinearLayoutManager(activity)



        recyclerAdapter = LearnCyberCrimeRecyclerAdapter(activity as Context, LearnCyberCrimeInfoList)

        recyclerLearnCyberCrime.adapter = recyclerAdapter
        recyclerLearnCyberCrime.layoutManager = layoutManager

        return view
    }



}