package com.csao.cybersecurity.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.csao.cybersecurity.R


class AboutAppFragment : Fragment() {

    lateinit var creatorTeam : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_about_app, container, false)

        creatorTeam = view.findViewById(R.id.creatorTeam)

        return view
    }

}