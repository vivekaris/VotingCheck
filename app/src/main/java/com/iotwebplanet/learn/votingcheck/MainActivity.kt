package com.iotwebplanet.learn.votingcheck

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //kotlin type casting

        val age=findViewById(R.id.age) as EditText

         val button=findViewById(R.id.button) as Button

        val msg=findViewById(R.id.msg) as TextView


        button.setOnClickListener(View.OnClickListener {

            //get user input
            var temp=age.text.toString().toInt()

            //logic
            if(temp>=18)
            {
                msg.setText("You are Eligble")
            }
            else
            {
                msg.setText("You are  Not Eligble")
            }



        })







    }
}
