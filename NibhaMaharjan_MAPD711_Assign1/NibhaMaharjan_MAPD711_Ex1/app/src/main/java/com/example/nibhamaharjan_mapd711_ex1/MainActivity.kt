// Name: Nibha Maharjan
// Student ID: 301282952
// Date Completed: 25th Sep 2023
// App Desc: Showing data from MainActivity to SecondActivity

package com.example.nibhamaharjan_mapd711_ex1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    //Declaring Variable to later store data from text box
    private lateinit var btnSendData : Button
    private lateinit var editName : EditText
    private lateinit var editQual : EditText
    private lateinit var editProf : EditText
    private lateinit var editHobb : EditText
    private lateinit var editDjob : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Assigning data from text fields and button to variable
        btnSendData = findViewById(R.id.button)
        editName = findViewById(R.id.editTextText)
        editQual= findViewById(R.id.editTextText2)
        editProf= findViewById(R.id.editTextText3)
        editHobb= findViewById(R.id.editTextText4)
        editDjob= findViewById(R.id.editTextText5)

        //Send button action
        btnSendData.setOnClickListener {
            startActivity(
                //Starting intent to SecondActivity
                Intent(this,SecondActivity::class.java)
                //Using key value pairs to pass the data into the second activity
                .putExtra("username",editName.text.toString())
                .putExtra("qualification",editQual.text.toString())
                .putExtra("profession",editProf.text.toString())
                .putExtra("hobby",editHobb.text.toString())
                .putExtra("dreamjob",editDjob.text.toString())
            )
        }

    }
    }
