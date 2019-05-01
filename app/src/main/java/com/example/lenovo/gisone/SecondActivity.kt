package com.example.lenovo.gisone

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        welcome.text = intent.getStringExtra("data")
        b1.text = intent.getStringExtra("data")
        b2.text = intent.getStringExtra("data")
        b3.text = intent.getStringExtra("data")
        b4.text = intent.getStringExtra("data")
        var params =  intent.getStringExtra("data");

        clickme.setOnClickListener(){
            val Intent = Intent(this, webview::class.java)
            Intent.putExtra("data", params.toString());
            startActivity(Intent(this, webview::class.java))
        }
    }
}