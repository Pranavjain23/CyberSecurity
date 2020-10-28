package com.csao.cybersecurity.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.app.ActivityCompat.recreate
import androidx.fragment.app.Fragment
import com.csao.cybersecurity.R
import com.csao.cybersecurity.activity.MainActivity
import com.csao.cybersecurity.model.LocaleHelper


class Language : Fragment() {
    lateinit var btnHindi:Button
    lateinit var btnEnglish:Button

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_language, container, false)
        getActionBar()?.setTitle(getString(R.string.lang))
        btnHindi=view.findViewById(R.id.btn1)
        btnEnglish=view.findViewById(R.id.btn2)

        btnHindi.setOnClickListener {
            LocaleHelper.setLocale(context, "hi")

            //It is required to recreate the activity to reflect the change in UI.
           // recreate(MainActivity())
        }
        btnEnglish.setOnClickListener {
            LocaleHelper.setLocale(context, "en")

        }
        return view;
    }
    private fun getActionBar(): androidx.appcompat.app.ActionBar? {
        return (activity as MainActivity).supportActionBar
    }
}