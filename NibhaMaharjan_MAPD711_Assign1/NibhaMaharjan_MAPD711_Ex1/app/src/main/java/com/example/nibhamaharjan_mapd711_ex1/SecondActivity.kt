package com.example.nibhamaharjan_mapd711_ex1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    //Creating variables
    private lateinit var textName : TextView
    private lateinit var textQual : TextView
    private lateinit var textProf : TextView
    private lateinit var textHobb : TextView
    private lateinit var textDjob : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //Identifying Variable with UI Textview ID
        textName = findViewById(R.id.textView7)
        textQual = findViewById(R.id.textView8)
        textProf = findViewById(R.id.textView9)
        textHobb = findViewById(R.id.textView10)
        textDjob = findViewById(R.id.textView11)

        //Using key from the Main activity intent to store data into values
        val userName = intent.getStringExtra("username")
        val userQual = intent.getStringExtra("qualification")
        val userProf = intent.getStringExtra("profession")
        val userHobb = intent.getStringExtra("hobby")
        val userDjob = intent.getStringExtra("dreamjob")

        //Updating the Variables in the UI Element
        textName.text = "Full Name : "+userName
        textQual.text = "Qualification : "+userQual
        textProf.text = "Profession : "+userProf
        textHobb.text = "Hobby : "+userHobb
        textDjob.text = "Dream Job : "+userDjob

    }
}