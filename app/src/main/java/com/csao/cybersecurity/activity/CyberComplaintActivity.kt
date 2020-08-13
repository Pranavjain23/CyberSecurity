package com.csao.cybersecurity.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import com.csao.cybersecurity.R

class CyberComplaintActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cyber_complaint)

        val textView = findViewById<TextView>(R.id.linkFAQ)
        textView.movementMethod = LinkMovementMethod.getInstance()

    }
}