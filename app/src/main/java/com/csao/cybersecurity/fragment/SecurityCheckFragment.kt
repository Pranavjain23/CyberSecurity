package com.csao.cybersecurity.fragment

import android.app.AlertDialog
import android.graphics.Color
import android.os.Bundle
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
    var msg:String=""
    var score:Int = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_security_check, container, false)


        getActionBar()?.setTitle(getString(R.string.securitycheck_heading));
            correct = view.findViewById(R.id.submit)

            correct.setOnClickListener {

                radio1 = view.findViewById(R.id.rg1)
                val select1 = radio1.checkedRadioButtonId
                val rb1: RadioButton = view.findViewById(select1)
                val str1 = "Yes"
                if ((rb1.text as String).trim { it <= ' ' } == str1.trim { it <= ' ' }) {
                    msg += "Good, keep changing your passwords frequently !\n"
                    score+=2

                } else {
                    msg += "You should atleast change your passwords once each month.\n"
                }

                radio2 = view.findViewById(R.id.rg2)
                val select2 = radio2.checkedRadioButtonId
                val rb2: RadioButton = view.findViewById(select2)
                val str2 = "From bank’s official website or app"
                if ((rb2.text as String).trim { it <= ' ' } == str2.trim { it <= ' ' }) {
                    msg= msg+rb2.text as String + " is correct practice !\n"
                    score+=2
                } else {
                    msg += "Never access your bank services from text messages or the mails that you receive because that may be fraud\n"
                }



                radio3 = view.findViewById(R.id.rg3)

                val select3 = radio3.checkedRadioButtonId
                val rb3: RadioButton = view.findViewById(select3)
                val str3 = "No"
                if ((rb3.text as String).trim { it <= ' ' } == str3.trim { it <= ' ' }) {
                    msg += "Also avoid connecting your phone to the free, unsecured Wi-Fi for logging into social media account\n"
                    score+=2
                } else {
                    msg += "You should avoid connecting your phone to the free, unsecured Wi-Fi for shopping or banking\n"
                }


                radio4 = view.findViewById(R.id.rg4)
                val select = radio4.checkedRadioButtonId
                val rb: RadioButton = view.findViewById(select)
                val str = "No"
                if ((rb.text as String).trim { it <= ' ' } == str.trim { it <= ' ' }) {
                    msg += "GOOD  ,   you should never install the softwares that comes as an attachment in emails.\n"
                    score+=2
                } else {
                    msg += "No! REMEMBER : you should never install the softwares that comes as an attachment in emails.\n"
                }


                radio5 = view.findViewById(R.id.rg5)
                val select5 = radio5.checkedRadioButtonId
                val rb5: RadioButton = view.findViewById(select5)
                val str5 = "No"
                if ((rb5.text as String).trim { it <= ' ' } == str5.trim { it <= ' ' }) {
                    score+=2
                    msg= msg+"GOOD  ,\tyou should never  share your personal details on phone email or sms.\n"

                } else {
                    msg= msg+"No! REMEMBER   :   you should never share these details on phone email or sms. Bank never asks for the user's information like that.\n"
                }

                alert_box(msg,score)
            }





        return view
    }
    fun alert_box(msg:String,score:Int){
        //       val dialog = AlertDialog.Builder(this@SecurityCheckActivity)
        var str:String=""
        if(score>=8){
            str="EXCELLENT PERFORMANCE !"
        }
        else if(score >=6 && score<=4 ){
            str="AVERAGE PERFORMANCE ! need to know more about cyber security"
        }
        else if(score<4 ){
            str="POOR PERFORMANCE ! need to know more about cyber security"
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


        val alert = AlertDialog.Builder(context)
        val mainLayout = LinearLayout(context)
        mainLayout.orientation = LinearLayout.VERTICAL

        val layout1 = LinearLayout(context)
        layout1.orientation = LinearLayout.HORIZONTAL
        val cb1 = TextView(context)
        cb1.text = str
        layout1.addView(cb1)
        layout1.setBackgroundColor(Color.YELLOW)
        layout1.minimumHeight = 50

        val layout2 = LinearLayout(context)
        layout2.orientation = LinearLayout.HORIZONTAL
        layout2.addView(TextView(context))
        val cb2 = TextView(context)
        cb2.text = "SUMMARY TO YOUR QUIZ:"
        layout2.addView(cb2)
        layout2.setBackgroundColor(Color.CYAN)
        layout2.minimumHeight = 50

        val layout3 = LinearLayout(context)
        layout3.orientation = LinearLayout.HORIZONTAL
        val cb3 = TextView(context)
        cb3.text = msg
        layout3.addView(cb3)
        layout3.setBackgroundColor(Color.YELLOW)
        layout3.minimumHeight = 350

        mainLayout.addView(layout1)
        mainLayout.addView(layout2)
        mainLayout.addView(layout3)
        alert.setTitle("SCORE =$score")
        alert.setView(mainLayout)
        alert.setNegativeButton(
            ""
        ) { dialog, which ->  }
        alert.setPositiveButton(
            "OKAY"
        ) { dialog, which ->  val fragment = HomeFragment()
            val args = Bundle()
            fragment.arguments = args
            (context as MainActivity).supportFragmentManager.beginTransaction()
                .replace(
                    R.id.frame,
                    fragment
                ).commit()
        }

        alert.show()
    }

    private fun getActionBar(): androidx.appcompat.app.ActionBar? {
        return (activity as MainActivity).supportActionBar
    }


}