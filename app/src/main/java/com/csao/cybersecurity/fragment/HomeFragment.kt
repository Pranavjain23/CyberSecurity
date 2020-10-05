package com.csao.cybersecurity.fragment

import android.content.Context
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.csao.cybersecurity.R
import com.csao.cybersecurity.adapter.HomeRecyclerAdapter
import com.csao.cybersecurity.model.Home
import java.util.*


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
    val homeInfoList = arrayListOf<Home>(

        Home("Security check",R.drawable.securitycheck),
        Home("Learn about Cyber Crime",R.drawable.learncybercrime),
        Home("Cyber Complaint",R.drawable.cybercomplaint),
        Home("Preventive Tips",R.drawable.preventivetips),
        Home("Helpline Numbers",R.drawable.helplinenumber),
        Home("Videos and Webinars",R.drawable.videosandwebinar)
    )

    lateinit var recyclerAdapter: HomeRecyclerAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_home, container, false)
        setHasOptionsMenu(true)


        recyclerHome = view.findViewById(R.id.recyclerHome)
        layoutManager= GridLayoutManager(activity,2)
        recyclerAdapter = HomeRecyclerAdapter(activity as Context, homeInfoList)

        recyclerHome.adapter = recyclerAdapter
        recyclerHome.layoutManager = layoutManager

        return view
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater?.inflate(R.menu.menu_home,menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.action_help){

        }
        recyclerAdapter.notifyDataSetChanged()

        return super.onOptionsItemSelected(item)
    }

}