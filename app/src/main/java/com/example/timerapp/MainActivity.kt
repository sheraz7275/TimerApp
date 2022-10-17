package com.example.timerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import java.util.*

private lateinit var timer:TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        timer=findViewById(R.id.txtTimer)



        val timeFormatter=SmartCashTimeFormatter()

        val initialTime= requireNotNull(timeFormatter.getMiles("06:00:00"))


        object : CountDownTimer(initialTime, 1000) {

            override fun onTick(millisUntilFinished: Long) {
                timer.text= timeFormatter.getFormattedTime(millisUntilFinished)
            }

            override fun onFinish() {

            }
        }.start()

    }



}