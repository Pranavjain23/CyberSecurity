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

class DoFragment : Fragment() {

    lateinit var recyclerDosAndDont: RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager


    val dosAndDontInfoList = arrayListOf<DosAndDont>(

        DosAndDont("Set your browser security to high and add safe websites to trusted website zone..", R.drawable.dos),
        DosAndDont("Disable the login and remembering passwords information...", R.drawable.dos),
        DosAndDont("Block pop up window in your web browser...", R.drawable.dos),
        DosAndDont( "Enable the option “warn me when sites try to install extensions/theme”  in your web browser..",R.drawable.dos),
        DosAndDont("Try to have separate email id other than your official id to be  used in social website...", R.drawable.dos),
        DosAndDont( "Be extremely careful about how you share personal information about yourself online", R.drawable.dos),
        DosAndDont("Make sure that your ISP and Internet Relay Chart (IRC) network have an acceptable use policy that prohibits cyber-stalking.", R.drawable.dos),
        DosAndDont("Always install recommended updates and install original antivirus and antispyware programs..", R.drawable.dos)
    )
    lateinit var recyclerAdapter: DosDontRecyclerAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_do, container, false)

        recyclerDosAndDont = view.findViewById(R.id.doRecycler)
        layoutManager = LinearLayoutManager(activity)

        recyclerAdapter = DosDontRecyclerAdapter(activity as Context, dosAndDontInfoList)

        recyclerDosAndDont.adapter = recyclerAdapter
        recyclerDosAndDont.layoutManager = layoutManager


        return view
    }



}