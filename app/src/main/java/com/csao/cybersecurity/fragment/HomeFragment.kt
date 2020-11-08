package com.csao.cybersecurity.fragment

import android.content.Context
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.csao.cybersecurity.R
import com.csao.cybersecurity.adapter.HomeRecyclerAdapter
import com.csao.cybersecurity.model.Home


class HomeFragment : Fragment() {

    lateinit var recyclerHome :RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager

    val homeList = arrayListOf(
        "Security check",
        "Learn about Cyber Crime",
        "Cyber complaint",
        "Preventive Tips",
        "Helpline Numbers",
        "Videos and Webinars"
    )



    lateinit var recyclerAdapter: HomeRecyclerAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_home, container, false)

        val homeInfoList = arrayListOf<Home>(
            Home(getString(R.string.security_check), R.drawable.securitycheck),
            Home(getString(R.string.lcc), R.drawable.learncybercrime),
            Home(getString(R.string.cybercomplaint), R.drawable.cybercomplaint),
            Home(getString(R.string.preventivetips), R.drawable.preventivetips),
            Home(getString(R.string.helpline_number), R.drawable.helplinenumber),
            Home(getString(R.string.vandw), R.drawable.videosandwebinar)
        )

        setHasOptionsMenu(true)


        recyclerHome = view.findViewById(R.id.recyclerHome)
        layoutManager= LinearLayoutManager(activity)
        recyclerAdapter = HomeRecyclerAdapter(activity as Context, homeInfoList)

        recyclerHome.adapter = recyclerAdapter
        recyclerHome.layoutManager = layoutManager

        return view
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater?.inflate(R.menu.menu_home, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item?.itemId
        if(id == R.id.action_lang){
            val someFragment: Fragment = Language()
            val transaction: FragmentTransaction = fragmentManager!!.beginTransaction()
            transaction.replace(
                R.id.frame,
                someFragment
            )
            transaction.commit()
        }

        return super.onOptionsItemSelected(item)
    }

}