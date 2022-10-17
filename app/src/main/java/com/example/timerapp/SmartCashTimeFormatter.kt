package com.example.timerapp

import android.annotation.SuppressLint
import android.os.CountDownTimer
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

@SuppressLint("SimpleDateFormat")
class SmartCashTimeFormatter {

    private val sdf = SimpleDateFormat("HH:mm:ss")


      fun getMiles(timeString:String): Long? {
        var miles :Long?=null
        try {
            val mDate = sdf.parse(timeString)
            miles  =  mDate.time

        } catch (e: ParseException) {
            e.printStackTrace()
        }

        return miles
    }

      fun getFormattedTime(miles:Long):String?  {
        var givenTime :String? =null
        try {
            givenTime = sdf.format(Date(miles))
        } catch (e: ParseException) {
            e.printStackTrace()
        }
        return givenTime
    }



}