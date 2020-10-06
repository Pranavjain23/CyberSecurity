package com.csao.cybersecurity.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.csao.cybersecurity.R
import com.csao.cybersecurity.activity.MainActivity


class Expert2ChandniAggFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_expert2_chandni_agg, container, false)
        getActionBar()?.setTitle("Chandni Agarwal");
        // Inflate the layout for this fragment
        return view
    }

    private fun getActionBar(): androidx.appcompat.app.ActionBar? {
        return (activity as MainActivity).supportActionBar
    }

}