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

        val link3 = view.findViewById<TextView>(R.id.link3)
        link3.movementMethod = LinkMovementMethod.getInstance()

        val link4 = view.findViewById<TextView>(R.id.link4)
        link4.movementMethod = LinkMovementMethod.getInstance()

        val link5 = view.findViewById<TextView>(R.id.link5)
        link5.movementMethod = LinkMovementMethod.getInstance()

        val link6 = view.findViewById<TextView>(R.id.link6)
        link6.movementMethod = LinkMovementMethod.getInstance()

        val link7 = view.findViewById<TextView>(R.id.link7)
        link7.movementMethod = LinkMovementMethod.getInstance()
        val link8 = view.findViewById<TextView>(R.id.link8)
        link8.movementMethod = LinkMovementMethod.getInstance()
        val link9 = view.findViewById<TextView>(R.id.link9)
        link9.movementMethod = LinkMovementMethod.getInstance()

        val link10 = view.findViewById<TextView>(R.id.link10)
        link10.movementMethod = LinkMovementMethod.getInstance()


        return view
    }


}