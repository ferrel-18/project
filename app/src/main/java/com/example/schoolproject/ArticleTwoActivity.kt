package com.example.schoolproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ArticleTwoActivity : AppCompatActivity() {
    lateinit var btn2bck:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article_two)
        btn2bck=findViewById(R.id.buttonart2back)
        btn2bck.setOnClickListener {
            val art2b=Intent(this,StudyArticlesActivity::class.java)
            startActivity(art2b)
        }
    }
}