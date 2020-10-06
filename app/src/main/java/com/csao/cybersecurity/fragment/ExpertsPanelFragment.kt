package com.csao.cybersecurity.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.cardview.widget.CardView
import com.csao.cybersecurity.R
import com.csao.cybersecurity.activity.MainActivity


class ExpertsPanelFragment : Fragment() {
    lateinit var card2 : CardView
    lateinit var card1 : CardView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_experts_panel, container, false)

        card2 = view.findViewById(R.id.card2)
        card1 = view.findViewById(R.id.card1)

        card1.setOnClickListener {
            val fragment = Expert2ChandniAggFragment()
            val args = Bundle()
            fragment.arguments = args
            (context as MainActivity).supportFragmentManager.beginTransaction()
                .replace(
                    R.id.frame,
                    fragment
                ).commit()
        }
        card2.setOnClickListener {
            val fragment = Expert1NishaDuaFragment()
            val args = Bundle()
            fragment.arguments = args
            (context as MainActivity).supportFragmentManager.beginTransaction()
                .replace(
                    R.id.frame,
                    fragment
                ).commit()
        }
        return view
    }


}