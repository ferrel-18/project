package com.example.schoolproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ArticleThreeActivity : AppCompatActivity() {
    lateinit var btn3bck:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article_three)
        btn3bck=findViewById(R.id.buttonart3back)
        btn3bck.setOnClickListener {
            val art3b=Intent(this,StudyArticlesActivity::class.java)
            startActivity(art3b)
        }
    }
}