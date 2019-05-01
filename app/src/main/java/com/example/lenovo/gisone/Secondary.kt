package com.example.lenovo.gisone

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class Secondary : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kuskesmas)

        welcome.text = intent.getStringExtra("data")
        b1.text = intent.getStringExtra("data")
        b2.text = intent.getStringExtra("data")
        b3.text = intent.getStringExtra("data")
        b4.text = intent.getStringExtra("data")



    }
}