package com.csao.cybersecurity.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.csao.cybersecurity.R
import com.csao.cybersecurity.adapter.DosDontRecyclerAdapter
import com.csao.cybersecurity.model.DosAndDont

class DontFragment : Fragment() {


    lateinit var recyclerDosAndDont: RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager




    lateinit var recyclerAdapter: DosDontRecyclerAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_dont, container, false)

        val dosAndDontInfoList = arrayListOf<DosAndDont>(
            DosAndDont(getString(R.string.dont1), R.drawable.dont),
            DosAndDont( getString(R.string.dont2), R.drawable.dont),
            DosAndDont( getString(R.string.dont3), R.drawable.dont),
            DosAndDont(getString(R.string.dont4), R.drawable.dont),
            DosAndDont(getString(R.string.dont5), R.drawable.dont),
            DosAndDont(getString(R.string.dont6), R.drawable.dont)
        )

        recyclerDosAndDont = view.findViewById(R.id.dontRecycler)
        layoutManager = LinearLayoutManager(activity)

        recyclerAdapter = DosDontRecyclerAdapter(activity as Context, dosAndDontInfoList)

        recyclerDosAndDont.adapter = recyclerAdapter
        recyclerDosAndDont.layoutManager = layoutManager


        return view
    }



}
