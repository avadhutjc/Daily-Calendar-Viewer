package com.ajc.dailycalendar
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.CalendarView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity(), View.OnClickListener {
    var calendar: Calendar? = null
    var calendarView: CalendarView? = null
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calendarView = findViewById(R.id.calendarView)

        calendarView!!.setOnDateChangeListener { calendarView, i, i1, i2 ->
            val msg = "Date: " + i2 + " Month : " + (i1 + 1) + " Year " + i
            // Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show()

            val toast = Toast.makeText(
                applicationContext, msg, Toast.LENGTH_SHORT
            )
            toast.show()

            val handler = Handler()
            handler.postDelayed(Runnable { toast.cancel() }, 1000)
        }
    }

    override fun onClick(view: View) {

    }
}
