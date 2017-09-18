package com.example.haith.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

var result: Int = 0

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num: Int=0
        var v : CharSequence? = textView.text



        btn0.setOnClickListener {
           v = "" + v + btn0.text + ""
            textView.text = v
        }

        btn1.setOnClickListener {
            v = "" + v + btn1.text + ""
            textView.text = v
        }

        btn2.setOnClickListener {
            v = "" + v + btn2.text + ""
            textView.text = v
        }

        btn3.setOnClickListener {
            v = "" + v + btn3.text + ""
            textView.text = v
        }

        btn4.setOnClickListener {
            v = "" + v + btn4.text + ""
            textView.text = v
        }

        btn5.setOnClickListener {
            v = "" + v + btn5.text + ""
            textView.text = v
        }

        btn6.setOnClickListener {
            v = "" + v + btn6.text + ""
            textView.text = v
        }

        btn7.setOnClickListener {
            v = "" + v + btn7.text + ""
            textView.text = v
        }

        btn8.setOnClickListener({
            v = "" + v + btn8.text + ""
            textView.text = v
        })

        btn9.setOnClickListener({
            v = "" + v + btn9.text + ""
            textView.text = v
        })

        btnClear.setOnClickListener({
            v=""
            textView.text = ""
        })

        btnAdd.setOnClickListener {

        }
    }





}
