package com.example.curriculumvitae1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        val fullname = findViewById(R.id.fullname) as EditText
        val age = findViewById(R.id.age) as EditText
        val email = findViewById(R.id.email) as EditText
        val android = findViewById(R.id.textView2) as TextView
        val ios = findViewById(R.id.textView3) as TextView
        val flutter = findViewById(R.id.textView4) as TextView
        val btnClick = findViewById(R.id.button3) as Button
        val reset = findViewById(R.id.button2) as Button
        val msg1: String = fullname.text.toString()
        val msg2: String = age.text.toString()
        val msg3: String = email.text.toString()
        val msg4: String = android.text.toString()
        val msg5: String = ios.text.toString()
        val msg6: String = flutter.text.toString()

        val seek1 = findViewById<SeekBar>(R.id.simpleSeekBar)
        val seek2 = findViewById<SeekBar>(R.id.simpleSeekBar1)
        val seek3 = findViewById<SeekBar>(R.id.simpleSeekBar2)
        reset.setOnClickListener {
            fullname.setText("")
            age.setText("")
            email.setText("")
            seek1.setProgress(0)
            seek2.setProgress(0)
            seek3.setProgress(0)
        }
        btnClick.setOnClickListener {
            //read value from EditText to a String variable


            if (seek1.progress <=30 && seek2.progress <=30 && seek3.progress <= 30){
                Toast.makeText(
                    applicationContext,
                    "Vous devez travailler vos skills" ,
                    Toast.LENGTH_SHORT
                ).show()
            }
           else if (seek1.progress > 80 ) {
                Toast.makeText(
                    applicationContext,
                    "Vous êtes excellent en " + msg4,
                    Toast.LENGTH_SHORT
                ).show()

            }
            else if (seek2.progress > 80){
                Toast.makeText(
                    applicationContext,
                    "Vous êtes excellent en " + msg5,
                    Toast.LENGTH_SHORT
                ).show()
            }
            else if (seek3.progress > 80){
                Toast.makeText(
                    applicationContext,
                    "Vous êtes excellent en " + msg6,
                    Toast.LENGTH_SHORT
                ).show()
            }
            else if (seek1.progress <= 80 && seek2.progress <= 80 && seek3.progress <= 80) {
                Toast.makeText(
                    applicationContext,
                    "Vous avez de exellents skills !»" ,
                    Toast.LENGTH_SHORT
                ).show()
            }
            else  {
                Toast.makeText(
                    applicationContext,
                    "Vous avez de bons skills !»" ,
                    Toast.LENGTH_SHORT
                ).show()
            }

            //check if the EditText have values or not
            if (msg1.trim().length > 0 && msg2.trim().length > 0 && msg3.trim().length > 0) {

                Toast.makeText(applicationContext, "Hello : " + msg1, Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(applicationContext, "Please enter data! ", Toast.LENGTH_SHORT).show()
            }

        }


    }
}