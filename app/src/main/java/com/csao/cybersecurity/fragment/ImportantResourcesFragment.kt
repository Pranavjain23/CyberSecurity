package com.csao.cybersecurity.fragment

import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.csao.cybersecurity.R

class ImportantResourcesFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_important_resources, container, false)

        val link1 = view.findViewById<TextView>(R.id.link1)
        link1.movementMethod = LinkMovementMethod.getInstance()

        val link2 = view.findViewById<TextView>(R.id.link2)
        link2.movementMethod = LinkMovementMethod.getInstance()
        return view
    }


}