package com.example.iteradmin.kotlin_app1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt1=findViewById<TextView>(R.id.text1)
        val txt2=findViewById<TextView>(R.id.text2)
        val bt1=findViewById<Button>(R.id.button1)
        val bt2=findViewById<Button>(R.id.button2)
        bt1.setOnClickListener(){
            txt1.setText("bubye world")

        }
    }
}
