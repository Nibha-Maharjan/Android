package com.example.nibhamaharjan_mapd711_ex2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    //Creating variables
    private lateinit var nameName : TextView
    private lateinit var nameQual : TextView
    private lateinit var nameProf : TextView
    private lateinit var nameHobb : TextView
    private lateinit var nameDjob : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //Identifying Variable with UI Textview ID
        nameName = findViewById(R.id.textView)
        nameQual = findViewById(R.id.textView12)
        nameProf = findViewById(R.id.textView13)
        nameHobb = findViewById(R.id.textView14)
        nameDjob = findViewById(R.id.textView15)

        //Using key from the Main activity intent to store data into values
        val userName = intent.getStringExtra("username")
        val userQual = intent.getStringExtra("qualification")
        val userProf = intent.getStringExtra("profession")
        val userHobb = intent.getStringExtra("hobby")
        val userDjob = intent.getStringExtra("dreamjob")


        //Updating the Variables in the UI Element
        nameName.text = "Full Name : "+userName
        nameQual.text = "Qualification : "+userQual
        nameProf.text = "Profession : "+userProf
        nameHobb.text = "Hobby : "+userHobb
        nameDjob.text = "Dream Job : "+userDjob

    }
}