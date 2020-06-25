package com.csao.cybersecurity.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.csao.cybersecurity.R
import com.csao.cybersecurity.adapter.DosDontRecyclerAdapter
import com.csao.cybersecurity.model.DosAndDont
import com.csao.cybersecurity.model.Home
import kotlinx.android.synthetic.main.fragment_dos_dont.*


class DosDontFragment : Fragment() {

    lateinit var recyclerDosAndDont:RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager

    val dosAndDontList = arrayListOf(
        "Set your browser security to high and add safe websites to trusted website zone..",
        "Disable the login and remembering passwords information...",
        "Block pop up window in your web browser...",
        "Enable the option “warn me when sites try to install extensions/theme”  in your web browser..",
        "Try to have separate email id other than your official id to be  used in social website...",
        "Be extremely careful about how you share personal information about yourself online",
        "Make sure that your ISP and Internet Relay Chart (IRC) network have an acceptable use policy that prohibits cyber-stalking.",
        "Always install recommended updates and install original antivirus and antispyware programs..",
        "Don't delete harmful communications (emails, chat logs, posts etc). These may help provide vital information about the identity of the person behind these..",
        "Do not open e-mail attachments from strangers, regardless of how enticing the subject line or attachment may be..",
        "Do not give your password to anybody. Somebody who is malicious can cause great harm to you and your reputation. It is like leaving your house open for a stranger and walking away.",
        "Do not copy a program that is copyrighted on the net. It is illegal.",
        "When talking to somebody new on the net, do not give away personal information-like numbers of the credit card used by your parents, your home addresses/ phone numbers and such other personal information...",
        "Do not open e-mail attachments from strangers, regardless of how enticing the subject line or attachment may be..."

    )

    val dosAndDontInfoList = arrayListOf<DosAndDont>(
        DosAndDont("Set your browser security to high and add safe websites to trusted website zone..", R.drawable.dos),
        DosAndDont("Disable the login and remembering passwords information...", R.drawable.dos),
        DosAndDont("Block pop up window in your web browser...", R.drawable.dos),
        DosAndDont( "Enable the option “warn me when sites try to install extensions/theme”  in your web browser..",R.drawable.dos),
        DosAndDont("Try to have separate email id other than your official id to be  used in social website...", R.drawable.dos),
        DosAndDont( "Be extremely careful about how you share personal information about yourself online", R.drawable.dos),
        DosAndDont("Make sure that your ISP and Internet Relay Chart (IRC) network have an acceptable use policy that prohibits cyber-stalking.", R.drawable.dos),
        DosAndDont("Always install recommended updates and install original antivirus and antispyware programs..", R.drawable.dos),
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
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_dos_dont, container, false)

        recyclerDosAndDont = view.findViewById(R.id.recyclerDosAndDont)
        layoutManager = LinearLayoutManager(activity)



        recyclerAdapter = DosDontRecyclerAdapter(activity as Context, dosAndDontInfoList)

        recyclerDosAndDont.adapter = recyclerAdapter
        recyclerDosAndDont.layoutManager = layoutManager


        return view
    }


}