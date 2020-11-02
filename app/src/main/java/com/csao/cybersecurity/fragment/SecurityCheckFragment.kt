package com.csao.cybersecurity.fragment

import android.app.AlertDialog
import android.graphics.Color
import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.csao.cybersecurity.R
import com.csao.cybersecurity.activity.MainActivity
import kotlinx.android.synthetic.*

class SecurityCheckFragment : Fragment() {
    lateinit var radio1: RadioGroup
    lateinit var radio4: RadioGroup
    lateinit var radio5: RadioGroup
    lateinit var radio2: RadioGroup
    lateinit var correct: Button
    lateinit var radio3: RadioGroup
    var msg1:String=""
    var msg2:String=""
    var msg3:String=""
    var msg4:String=""
    var msg5:String=""
    var score:Int = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_security_check, container, false)


        getActionBar()?.setTitle(getString(R.string.security_check));
            correct = view.findViewById(R.id.submit)

            correct.setOnClickListener {

                radio1 = view.findViewById(R.id.rg1)
                val select1 = radio1.checkedRadioButtonId
                val rb1: RadioButton = view.findViewById(select1)
                val str1 = getString(R.string.yes)
                if ((rb1.text as String).trim { it <= ' ' } == str1.trim { it <= ' ' }) {
                    msg1= getString(R.string.msg1)
                    score+=2

                } else {
                    msg1= getString(R.string.msg11)
                }

                radio2 = view.findViewById(R.id.rg2)
                val select2 = radio2.checkedRadioButtonId
                val rb2: RadioButton = view.findViewById(select2)
                val str2 = getString(R.string.from_bank_s_official_website_or_app)
                if ((rb2.text as String).trim { it <= ' ' } == str2.trim { it <= ' ' }) {
                    msg2= "○ "+ rb2.text as String + getString(R.string.msg2)
                    score+=2
                } else {
                    msg2= getString(R.string.msg22)
                }



                radio3 = view.findViewById(R.id.rg3)

                val select3 = radio3.checkedRadioButtonId
                val rb3: RadioButton = view.findViewById(select3)
                val str3 = getString(R.string.no)
                if ((rb3.text as String).trim { it <= ' ' } == str3.trim { it <= ' ' }) {
                    msg3= getString(R.string.msg3)
                    score+=2
                } else {
                    msg3= getString(R.string.msg33)
                }


                radio4 = view.findViewById(R.id.rg4)
                val select = radio4.checkedRadioButtonId
                val rb: RadioButton = view.findViewById(select)
                val str = getString(R.string.no)
                if ((rb.text as String).trim { it <= ' ' } == str.trim { it <= ' ' }) {
                    msg4= getString(R.string.msg4)
                    score+=2
                } else {
                    msg4 = getString(R.string.msg44)
                }


                radio5 = view.findViewById(R.id.rg5)
                val select5 = radio5.checkedRadioButtonId
                val rb5: RadioButton = view.findViewById(select5)
                val str5 = getString(R.string.no)
                if ((rb5.text as String).trim { it <= ' ' } == str5.trim { it <= ' ' }) {
                    score+=2
                    msg5= getString(R.string.msg5)

                } else {
                    msg5= getString(R.string.msg55)
                }

                alert_box(msg1,msg2,msg3,msg4,msg5,score)
            }

        return view
    }
    fun alert_box(msg1:String,msg2:String,msg3:String,msg4:String,msg5:String,score:Int){
        if(msg1==""||msg2==""||msg3==""||msg4==""||msg5==""){
            Toast.makeText(context,"PLEASE ANSWER ALL THE QUESTIONS",Toast.LENGTH_LONG).show()
            val fragment = HomeFragment()
            val args = Bundle()
            fragment.arguments = args
            (context as MainActivity).supportFragmentManager.beginTransaction()
                    .replace(
                            R.id.frame,
                            fragment
                    ).commit()

        }
        //       val dialog = AlertDialog.Builder(this@SecurityCheckActivity)
        var str:String="---"
        if(score>=8){
            str+=getString(R.string.sc1)
        }
        else if(score in 6..4){
            str+=getString(R.string.sc2)
        }
        else {
            str+=getString(R.string.sc3)
        }
//        dialog.setTitle("Score = "+score)
//        dialog.setMessage( Html.fromHtml("<font color='#FF7F27'>$str\n"+ "SUMMARY TO YOUR QUIZ: \n\n"
//                +"$msg</font>")) //"$str\nSUMMARY TO YOUR QUIZ: \n\n$msg"
//
//        dialog.setPositiveButton("Okay"){ text,listener ->
//            finish()
//        }
//
//        dialog.setNegativeButton(""){ text, listener ->
//        }
//        dialog.create()
//        dialog.show()

//---------------------------------------------------------------------

    val items = arrayOf(str,msg1, msg2, msg3, msg4, msg5)
    AlertDialog.Builder(context)
        .setTitle(Html.fromHtml("<font color='#2a405e'>SCORE : $score</font>"))
        .setItems(items) { dialog, which ->
//            Toast.makeText(context, str+"\n"+getString(R.string.lcc), Toast.LENGTH_LONG).show()
//             val fragment = HomeFragment()
//            val args = Bundle()
//            fragment.arguments = args
//            (context as MainActivity).supportFragmentManager.beginTransaction()
//                    .replace(
//                            R.id.frame,
//                            fragment
//                    ).commit()
        }
        .setNegativeButton(getString(R.string.ok))
//        { dialog, which ->
//            Toast.makeText(context, "", Toast.LENGTH_LONG).show()
        { dialog, which ->  val fragment = HomeFragment()
            val args = Bundle()
            fragment.arguments = args
            (context as MainActivity).supportFragmentManager.beginTransaction()
                .replace(
                    R.id.frame,
                    fragment
                ).commit()
        }
        .show()

//------------------------------------------------------------------

//        val layout2 = LinearLayout(context)
//        layout2.orientation = LinearLayout.HORIZONTAL
//        layout2.addView(TextView(context))
//        val cb2 = TextView(context)
//        cb2.text = "SUMMARY TO YOUR QUIZ:"
//        layout2.addView(cb2)
//        layout2.setBackgroundColor(Color.CYAN)
//        layout2.minimumHeight = 50
//
//        val layout3 = LinearLayout(context)
//        layout3.orientation = LinearLayout.HORIZONTAL
//        val cb3 = TextView(context)
//        cb3.text = msg
//        layout3.addView(cb3)
//        layout3.setBackgroundColor(Color.YELLOW)
//        layout3.minimumHeight = 350
//        val alert = AlertDialog.Builder(context)
//        val mainLayout = LinearLayout(context)
//        mainLayout.orientation = LinearLayout.VERTICAL
//
//        val layout1 = LinearLayout(context)
//        layout1.orientation = LinearLayout.HORIZONTAL
//        val cb1 = TextView(context)
//        cb1.text = str
//        layout1.addView(cb1)
//        layout1.setBackgroundColor(Color.YELLOW)
//        layout1.minimumHeight = 50
//        mainLayout.addView(layout1)
//        mainLayout.addView(layout2)
//        mainLayout.addView(layout3)
//        alert.setTitle("SCORE =$score")
//        alert.setView(mainLayout)
//        alert.setNegativeButton(
//            ""
//        ) { dialog, which ->  }
//        alert.setPositiveButton(
//            "OKAY"
//        ) { dialog, which ->  val fragment = HomeFragment()
//            val args = Bundle()
//            fragment.arguments = args
//            (context as MainActivity).supportFragmentManager.beginTransaction()
//                .replace(
//                    R.id.frame,
//                    fragment
//                ).commit()
//        }
//
//        alert.show()
    }

    private fun getActionBar(): androidx.appcompat.app.ActionBar? {
        return (activity as MainActivity).supportActionBar
    }


}