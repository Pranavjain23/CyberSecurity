package com.csao.cybersecurity.fragment

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color.red
import android.os.Bundle
import android.os.Handler
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
    lateinit var btnGujrati:Button
    lateinit var btnTamil:Button

    @SuppressLint("ResourceAsColor")
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_language, container, false)
        btnHindi=view.findViewById(R.id.btn1)
        btnEnglish=view.findViewById(R.id.btn2)
        btnGujrati=view.findViewById(R.id.btn3)
        btnTamil=view.findViewById(R.id.btn4)

        btnHindi.setOnClickListener {
            btnHindi.setBackgroundColor(R.color.lightBlue)
            LocaleHelper.setLocale(context, "hi")
            btnHindi.setTextSize(30F)

            Handler().postDelayed({
                val fragment = HomeFragment()
                val args = Bundle()
                fragment.arguments = args
                (context as MainActivity).supportFragmentManager.beginTransaction()
                    .replace(
                        R.id.frame,
                        fragment
                    ).commit()
            },300)
            getActionBar()?.setTitle(getString(R.string.home));
            //It is required to recreate the activity to reflect the change in UI.
           // recreate(MainActivity())
        }
        btnEnglish.setOnClickListener {
            LocaleHelper.setLocale(context, "en")
            btnEnglish.setBackgroundColor(R.color.lightBlue)
            btnEnglish.setTextSize(30F)

            Handler().postDelayed({
                val fragment = HomeFragment()
                val args = Bundle()
                fragment.arguments = args
                (context as MainActivity).supportFragmentManager.beginTransaction()
                    .replace(
                        R.id.frame,
                        fragment
                    ).commit()
            },300)
            getActionBar()?.setTitle(getString(R.string.home));
        }

        btnGujrati.setOnClickListener {
            LocaleHelper.setLocale(context, "gu")
            btnGujrati.setBackgroundColor(R.color.lightBlue)
            btnGujrati.setTextSize(30F)

            Handler().postDelayed({
                val fragment = HomeFragment()
                val args = Bundle()
                fragment.arguments = args
                (context as MainActivity).supportFragmentManager.beginTransaction()
                    .replace(
                        R.id.frame,
                        fragment
                    ).commit()
            },300)
            getActionBar()?.setTitle(getString(R.string.home));
        }

        btnTamil.setOnClickListener {
            LocaleHelper.setLocale(context, "ta")
            btnTamil.setBackgroundColor(R.color.lightBlue)
            btnTamil.setTextSize(30F)

            Handler().postDelayed({
                val fragment = HomeFragment()
                val args = Bundle()
                fragment.arguments = args
                (context as MainActivity).supportFragmentManager.beginTransaction()
                    .replace(
                        R.id.frame,
                        fragment
                    ).commit()
            },300)
            getActionBar()?.setTitle(getString(R.string.home));
        }
        return view;
    }

    private fun getActionBar(): androidx.appcompat.app.ActionBar? {
        return (activity as MainActivity).supportActionBar
    }
}