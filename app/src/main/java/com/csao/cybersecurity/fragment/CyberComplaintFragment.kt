package com.csao.cybersecurity.fragment

import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.csao.cybersecurity.R
import com.csao.cybersecurity.activity.MainActivity

class CyberComplaintFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_cyber_complaint, container, false)

        getActionBar()?.setTitle(getString(R.string.cybercomplaint));
        val textView = view.findViewById<TextView>(R.id.linkFAQ)
        textView.movementMethod = LinkMovementMethod.getInstance()

        return view
    }
    private fun getActionBar(): androidx.appcompat.app.ActionBar? {
        return (activity as MainActivity).supportActionBar
    }
}