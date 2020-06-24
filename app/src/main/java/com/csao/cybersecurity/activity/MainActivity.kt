package com.csao.cybersecurity.activity

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.FrameLayout
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.csao.cybersecurity.DosDontFragment
import com.csao.cybersecurity.R
import com.csao.cybersecurity.fragment.AboutAppFragment
import com.csao.cybersecurity.fragment.CaseStudyFragment
import com.csao.cybersecurity.fragment.HomeFragment
import com.csao.cybersecurity.fragment.ShareFragment
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {


    lateinit var drawerLayout : DrawerLayout
    lateinit var coordinatorLayout: CoordinatorLayout
    lateinit var toolbar: androidx.appcompat.widget.Toolbar
    lateinit var frameLayout: FrameLayout
    lateinit var navigationView: NavigationView
    lateinit var sharedPreferences: SharedPreferences

    var previousMenuItem: MenuItem? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawerLayout)
        coordinatorLayout = findViewById(R.id.coordinatorLayout)
        toolbar = findViewById(R.id.toolbar)
        frameLayout = findViewById(R.id.frame)
        navigationView = findViewById(R.id.navigationView)

        sharedPreferences=getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)
        setUpToolbar()

        openHome()

        val actionBarDrawerToggle = ActionBarDrawerToggle(
            this@MainActivity,
            drawerLayout,
            R.string.open_drawer,
            R.string.close_drawer
        )


        drawerLayout.addDrawerListener(actionBarDrawerToggle)   //making work hamburger icon
        actionBarDrawerToggle.syncState()


        navigationView.setNavigationItemSelectedListener {
            // it will give currently selected item

            if (previousMenuItem!=null){
                previousMenuItem?.isChecked = false
            }

            it.isCheckable = true
            it.isChecked = true
            previousMenuItem = it

            when(it.itemId){
                R.id.home ->{

                    openHome()
                    drawerLayout.closeDrawers()
                }
                R.id.dos ->{
                    supportFragmentManager.beginTransaction()
                        .replace(
                            R.id.frame,
                            DosDontFragment()
                        )                                                                                                       // dashboard fragment is replacing the blank frame
                        .commit()

                    supportActionBar?.title = "Do's And Don'ts"                                                      //giving the title
                    drawerLayout.closeDrawers()
                }

                R.id.caseStudy ->{
                    supportFragmentManager.beginTransaction()
                        .replace(
                            R.id.frame,
                            CaseStudyFragment()
                        )                                                                                        // dashboard fragment is replacing the blank frame
                        .commit()

                    supportActionBar?.title = "Case Study"                                                     //giving the title
                    drawerLayout.closeDrawers()
                }

                R.id.share -> {
                    supportFragmentManager.beginTransaction()
                        .replace(
                            R.id.frame,
                            ShareFragment()
                        )                                                                                     // dashboard fragment is replacing the blank frame
                        .commit()

                    supportActionBar?.title = "Share"
                    drawerLayout.closeDrawers()

                }

                R.id.about_app ->{
                    supportFragmentManager.beginTransaction()
                        .replace(
                            R.id.frame,
                            AboutAppFragment()
                        )                                                                          // dashboard fragment is replacing the blank frame
                        .commit()

                    supportActionBar?.title = "About App"
                    drawerLayout.closeDrawers()
                }





            }

            return@setNavigationItemSelectedListener true
        }

    }
    fun setUpToolbar(){
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Toolbar title"
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    // for the clicking on hamburger and opening of drawer from the left side
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId

        if(id==android.R.id.home)
        {
            drawerLayout.openDrawer(GravityCompat.START)
        }

        return super.onOptionsItemSelected(item)
    }

    fun openHome(){
        val fragment = HomeFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame, fragment)   // dashboard fragment is replacing the blank frame
        transaction.commit()
        supportActionBar?.title = "Home"    //giving the title to each fragment
        navigationView.setCheckedItem(R.id.home)
    }

    override fun onBackPressed() {
        val frag = supportFragmentManager.findFragmentById(R.id.frame)

        when(frag){
            !is HomeFragment -> openHome()    // if at any frame ie other than dashboard this will bring back to dasboard on pressing back key

            else -> super.onBackPressed()     // Exit the app (default)
        }
    }

}