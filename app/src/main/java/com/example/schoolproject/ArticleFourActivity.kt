package com.example.schoolproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ArticleFourActivity : AppCompatActivity() {
    lateinit var btnart4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article_four)
        btnart4=findViewById(R.id.buttonart4back)
        btnart4.setOnClickListener {
            val art4= Intent(this,StudyArticlesActivity::class.java)
            startActivity(art4)
        }
    }
}