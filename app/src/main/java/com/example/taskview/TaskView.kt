package com.example.taskview

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.util.AttributeSet
import android.view.View
import android.widget.TextView
import java.util.jar.Attributes

@SuppressLint("AppCompatCustomView")
class TaskView(context: Context, attributeSet: AttributeSet):TextView(context,attributeSet){
    var taskstatus=true

    set(value) {
        field=value
        if(field){
            setTextColor(Color.GREEN)
        }
        else{
            setTextColor(Color.RED)
        }
    }

    var task:String=""
    set(value) {
        field=value
    }


    init{
        setTextColor(Color.RED)

        setOnClickListener{
            taskstatus=!taskstatus
        }
    }


    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawLine(20F,0F,20F,90F,paint)
        canvas?.drawLine(30F,0F,30F,90F,paint)
    }
}
