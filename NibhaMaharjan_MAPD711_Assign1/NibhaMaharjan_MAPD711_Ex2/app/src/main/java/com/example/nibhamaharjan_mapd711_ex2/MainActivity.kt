// Name: Nibha Maharjan
// Student ID: 301282952
// Date Completed: 25th Sep 2023
// App Desc: Showing data from strings.XML to MainActivity and finally to SecondActivity using intent
// Task: Task 2

package com.example.nibhamaharjan_mapd711_ex2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    //Declaring Variable to later store data from text box
    private lateinit var btnSendData : Button
    private lateinit var textName : TextView
    private lateinit var textQual : TextView
    private lateinit var textProf : TextView
    private lateinit var textHobb : TextView
    private lateinit var textDjob : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Crealing Value to store data from strings.xml file using keys
        val stringValue = resources.getString(R.string.fullName)
        val stringValue2 = resources.getString(R.string.qualName)
        val stringValue3 = resources.getString(R.string.profName)
        val stringValue4 = resources.getString(R.string.hobbName)
        val stringValue5 = resources.getString(R.string.djobName)

        //Connecting variable to text fields and button
        btnSendData = findViewById(R.id.button)
        textName = findViewById(R.id.textView7)
        textQual = findViewById(R.id.textView8)
        textProf = findViewById(R.id.textView9)
        textHobb = findViewById(R.id.textView10)
        textDjob = findViewById(R.id.textView11)

        //Updating the text fields in our main activity to show the data
        textName.text = stringValue
        textQual.text = stringValue2
        textProf.text = stringValue3
        textHobb.text = stringValue4
        textDjob.text = stringValue5

        //Send button action
        btnSendData.setOnClickListener {
            startActivity(
                //Starting intent to SecondActivity
                Intent(this,SecondActivity::class.java)
                    //Using key value pairs to pass the data into the second activity
                    .putExtra("username",textName.text.toString())
                    .putExtra("qualification",textQual.text.toString())
                    .putExtra("profession",textProf.text.toString())
                    .putExtra("hobby",textHobb.text.toString())
                    .putExtra("dreamjob",textDjob.text.toString())
            )
        }


    }


}