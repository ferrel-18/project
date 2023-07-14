package com.example.schoolproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ArticleOneActivity : AppCompatActivity() {
    lateinit var btart1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article_one)
        btart1=findViewById(R.id.buttonart1back)
        btart1.setOnClickListener {
            val art1b=Intent(this,StudyArticlesActivity::class.java)
            startActivity(art1b)
        }
    }
}