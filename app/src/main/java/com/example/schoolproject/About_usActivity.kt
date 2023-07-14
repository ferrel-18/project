package com.example.schoolproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class About_usActivity : AppCompatActivity() {
    lateinit var abback:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)
        abback=findViewById(R.id.btn_ABBack)
        abback.setOnClickListener {
            val goback=Intent(this,HomeActivity::class.java)
            startActivity(goback)
        }
    }
}