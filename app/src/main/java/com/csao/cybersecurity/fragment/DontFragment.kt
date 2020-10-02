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



    val dosAndDontInfoList = arrayListOf<DosAndDont>(

        DosAndDont("Don't delete harmful communications (emails, chat logs, posts etc). These may help provide vital information about the identity of the person behind these..", R.drawable.dont),
        DosAndDont( "Do not open e-mail attachments from strangers, regardless of how enticing the subject line or attachment may be..", R.drawable.dont),
        DosAndDont( "Do not give your password to anybody. Somebody who is malicious can cause great harm to you and your reputation. It is like leaving your house open for a stranger and walking away.", R.drawable.dont),
        DosAndDont("Do not copy a program that is copyrighted on the net. It is illegal.", R.drawable.dont),
        DosAndDont("When talking to somebody new on the net, do not give away personal information-like numbers of the credit card used by your parents, your home addresses/ phone numbers and such other personal information...", R.drawable.dont),
        DosAndDont("Do not open e-mail attachments from strangers, regardless of how enticing the subject line or attachment may be...", R.drawable.dont)

    )
    lateinit var recyclerAdapter: DosDontRecyclerAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_dont, container, false)

        recyclerDosAndDont = view.findViewById(R.id.dontRecycler)
        layoutManager = LinearLayoutManager(activity)

        recyclerAdapter = DosDontRecyclerAdapter(activity as Context, dosAndDontInfoList)

        recyclerDosAndDont.adapter = recyclerAdapter
        recyclerDosAndDont.layoutManager = layoutManager


        return view
    }



}
