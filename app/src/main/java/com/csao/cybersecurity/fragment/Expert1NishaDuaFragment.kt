package com.csao.cybersecurity.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.csao.cybersecurity.R
import com.csao.cybersecurity.activity.MainActivity

class Expert1NishaDuaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        getActionBar()?.setTitle("Nisha Dua");
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_expert1_nisha_dua, container, false)
        return view
    }

    private fun getActionBar(): androidx.appcompat.app.ActionBar? {
        return (activity as MainActivity).supportActionBar
    }


}