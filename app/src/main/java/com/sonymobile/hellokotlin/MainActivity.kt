package com.sonymobile.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mButton = findViewById<Button>(R.id.button1)

        mButton.isEnabled = true

        mButton.setOnClickListener {
            myFun("a")
            println("towa on click...") }
    }

    class Test (testString: String) {
        private var mTestString = testString;

        fun printTestString() {
            println("towa test string: " + mTestString)
        }
    }


    fun myFun(str: String): Int {
        val list = listOf("a","b","c")

        println("towa str = " + str);

        when {"a" in list -> println("towa a super!")}

        for ( x in list) {
            println("towa list: " + x )

            if (x is String) {
                // `obj` is automatically cast to `String` in this branch
                print("towa element length "+  x.length)
                var t = Test("arse")
                t.printTestString();

                if (x == "a") {
                    println("towa elemen twas a!")
                } else {
                    println("towa element was not a")
                }
            }
        }

        return 99
    }
}