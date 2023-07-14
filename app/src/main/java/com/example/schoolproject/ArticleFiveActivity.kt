package com.example.schoolproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ArticleFiveActivity : AppCompatActivity() {
    lateinit var btnback:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article_five)
        btnback=findViewById(R.id.buttonart5back)
        btnback.setOnClickListener {
            val art5bck= Intent(this,StudyArticlesActivity::class.java)
            startActivity(art5bck)
        }
    }
}