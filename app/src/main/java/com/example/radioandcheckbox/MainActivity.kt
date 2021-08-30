package com.example.radioandcheckbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {
            var checked= rg.checkedRadioButtonId
            var s:String=findViewById<RadioButton>(checked).text.toString()
            if(checkBox.isChecked){
                s +"hee"
            }
            if(checkBox2.isChecked){
                s+"\t haaa"
            }


            Toast.makeText(this,"you have selected $s",Toast.LENGTH_SHORT).show()

        }
    }
}