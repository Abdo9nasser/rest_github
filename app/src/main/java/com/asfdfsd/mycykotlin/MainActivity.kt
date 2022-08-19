package com.asfdfsd.mycykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var resycli : RecyclerView
    lateinit var adpter :set_adabter
    lateinit var list : ArrayList<data>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resycli=findViewById(R.id.rrrrrrr)
        resycli.layoutManager=LinearLayoutManager(this)
        full()
        adpter = set_adabter(list)
        resycli.adapter=adpter
        adpter.opinclick = object :set_adabter.initemclick{
            override fun inclick(host: data, position: Int) {
              Log.e("fdgg","fgdgdfg$position")
            }

        }



    }
    fun full()
    {
       list =ArrayList<data>()
        for (i in 1..100)
        {
            list.add(data(R.drawable.wifi,"ujjkjk","vkhvhvh"))
        }

    }
}