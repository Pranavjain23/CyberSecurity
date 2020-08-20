package com.csao.cybersecurity.fragment

import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.csao.cybersecurity.R

class CreditsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_credits, container, false)

        val link1 = view.findViewById<TextView>(R.id.linking1)
        link1.movementMethod = LinkMovementMethod.getInstance()
        val link2 = view.findViewById<TextView>(R.id.linking2)
        link2.movementMethod = LinkMovementMethod.getInstance()
        val link3 = view.findViewById<TextView>(R.id.linking3)
        link3.movementMethod = LinkMovementMethod.getInstance()
        val link4 = view.findViewById<TextView>(R.id.linking4)
        link4.movementMethod = LinkMovementMethod.getInstance()
        val link5 = view.findViewById<TextView>(R.id.linking5)
        link5.movementMethod = LinkMovementMethod.getInstance()
        val link6 = view.findViewById<TextView>(R.id.linking6)
        link6.movementMethod = LinkMovementMethod.getInstance()
        val link7 = view.findViewById<TextView>(R.id.linking7)
        link7.movementMethod = LinkMovementMethod.getInstance()

        return view
    }


}