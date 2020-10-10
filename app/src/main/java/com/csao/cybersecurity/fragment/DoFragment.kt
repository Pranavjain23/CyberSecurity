package com.csao.cybersecurity.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.csao.cybersecurity.R
import com.csao.cybersecurity.adapter.DosDontRecyclerAdapter
import com.csao.cybersecurity.model.DosAndDont


class DoFragment : Fragment() {

    lateinit var recyclerDosAndDont: RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager

  //  var mystring: String = viewHolder.itemView.getContext().getString(R.string.mystring)

    lateinit var recyclerAdapter: DosDontRecyclerAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_do, container, false)

        recyclerDosAndDont = view.findViewById(R.id.doRecycler)
        layoutManager = LinearLayoutManager(activity)
        val dosAndDontInfoList= arrayListOf<DosAndDont>(
            DosAndDont(getString(R.string.do1), R.drawable.dos),
            DosAndDont(getString(R.string.do2), R.drawable.dos),
            DosAndDont(getString(R.string.do3), R.drawable.dos),
            DosAndDont( getString(R.string.do4),R.drawable.dos),
            DosAndDont(getString(R.string.do5), R.drawable.dos),
            DosAndDont( getString(R.string.do6), R.drawable.dos),
            DosAndDont(getString(R.string.do7), R.drawable.dos),
            DosAndDont(getString(R.string.do8), R.drawable.dos)
        )

        recyclerAdapter = DosDontRecyclerAdapter(activity as Context, dosAndDontInfoList)

        recyclerDosAndDont.adapter = recyclerAdapter
        recyclerDosAndDont.layoutManager = layoutManager


        return view
    }



}