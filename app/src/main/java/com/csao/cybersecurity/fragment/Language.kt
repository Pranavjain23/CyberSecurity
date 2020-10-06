package com.csao.cybersecurity.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.csao.cybersecurity.R
import com.csao.cybersecurity.activity.MainActivity


class Language : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_language, container, false)
        getActionBar()?.setTitle(getString(R.string.lang));

        return view;
    }
    private fun getActionBar(): androidx.appcompat.app.ActionBar? {
        return (activity as MainActivity).supportActionBar
    }
}