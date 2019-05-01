package com.example.lenovo.gisone

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity() {
    private lateinit var Pass: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Pass = this.findViewById(R.id.password)


        signIi.setOnClickListener() {
            if (Pass.length() == 0) {
                Toast.makeText(this, "harap Mengisi Lokasi", Toast.LENGTH_LONG).show()
            } else if (Pass.length() >=16) {
                Toast.makeText(this, "Lokasi yang anda input terlalu Panjang", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("data", password.text.toString())
                startActivity(intent)
            }
        }

        uks.setOnClickListener() {
            if (Pass.length() == 0) {
                Toast.makeText(this, "harap Mengisi Lokasi", Toast.LENGTH_LONG).show()
            } else if (Pass.length() >=16) {
                Toast.makeText(this, "Lokasi yang anda input terlalu Panjang", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this, Secondary::class.java)
                intent.putExtra("data", password.text.toString())
                startActivity(intent)
            }
        }
    }
}
