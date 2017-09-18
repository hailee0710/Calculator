package com.example.haith.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

var result: Int = 0

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var numa : Int? = 0
        var numb = 0
        var function : String? = ""
        var result : Int = 0
        var v : CharSequence? = textView.text



        btn0.setOnClickListener {
           v = "" + v + btn0.text + ""
            textView.text = v
            tvError.text = ""
        }

        btn1.setOnClickListener {
            v = "" + v + btn1.text + ""
            textView.text = v
            tvError.text = ""
        }

        btn2.setOnClickListener {
            v = "" + v + btn2.text + ""
            textView.text = v
            tvError.text = ""
        }

        btn3.setOnClickListener {
            v = "" + v + btn3.text + ""
            textView.text = v
            tvError.text = ""
        }

        btn4.setOnClickListener {
            v = "" + v + btn4.text + ""
            textView.text = v
            tvError.text = ""
        }

        btn5.setOnClickListener {
            v = "" + v + btn5.text + ""
            textView.text = v
            tvError.text = ""

        }

        btn6.setOnClickListener {
            v = "" + v + btn6.text + ""
            textView.text = v
            tvError.text = ""
        }

        btn7.setOnClickListener {
            v = "" + v + btn7.text + ""
            textView.text = v
            tvError.text = ""
        }

        btn8.setOnClickListener({
            v = "" + v + btn8.text + ""
            textView.text = v
            tvError.text = ""
        })

        btn9.setOnClickListener({
            v = "" + v + btn9.text + ""
            textView.text = v
            tvError.text = ""
        })

        btnClear.setOnClickListener({
            v=""
            textView.text = ""
            tvError.text = ""
        })

        btnAdd.setOnClickListener {

            if(textView.text != ""){
                numa = textView.text.toString().toInt()
                function = "Add"
                textView.text = ""
                v=""

            } else {

                    tvError.text = "Please enter a number!"

            }

        }

        btnMinus.setOnClickListener {
            tvError.text = ""
            if(textView.text != ""){
                numa = textView.text.toString().toInt()
                function = "Minus"
                textView.text = ""
                v=""

            } else {

                tvError.text = "Please enter a number!"

            }

        }

        btnMul.setOnClickListener {
            tvError.text = ""
            if(textView.text != ""){
                numa = textView.text.toString().toInt()
                function = "Multiply"
                textView.text = ""
                v=""

            } else {

                tvError.text = "Please enter a number!"

            }

        }

        btnDivide.setOnClickListener {
            tvError.text = ""
            if(textView.text != ""){
                numa = textView.text.toString().toInt()
                function = "Divide"
                textView.text = ""
                v=""
            } else {

                tvError.text = "Please enter a number!"

            }

        }

        btnResult.setOnClickListener {
            tvError.text = ""
            if(textView.text != "" && textView.text != "0"){
                numb = textView.text.toString().toInt()
                when(function){
                    "Add" -> result = numa + numb
                    "Minus" -> result = numa - numb
                    "Multiply" -> result = numa*numb
                    "Divide" -> result = numa/numb
                }

            }
            if(textView.text == "0"){
                numb = textView.text.toString().toInt()
                when(function){
                    "Add" -> result = numa + numb
                    "Minus" -> result = numa - numb
                    "Multiply" -> result = numa*numb
                    "Divide" -> tvError.text = "Cannot divide 0"
                }
            }
            if(textView.text == "") {

                tvError.text = "Please enter a number!"

            }

            textView.text = result.toString()
            v=""
            function=""


        }
    }





}
