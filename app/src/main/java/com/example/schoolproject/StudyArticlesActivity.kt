package com.example.schoolproject

import android.content.ClipData.Item
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StudyArticlesActivity : AppCompatActivity() {
    lateinit var article1:CardView
    lateinit var article2:CardView
    lateinit var article3:CardView
    lateinit var article4:CardView
    lateinit var article5:CardView
    lateinit var article_back:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_study_articles)

        article1=findViewById(R.id.crd_article1)
        article2=findViewById(R.id.crd_article2)
        article3=findViewById(R.id.crd_article3)
        article4=findViewById(R.id.crd_article4)
        article5=findViewById(R.id.crd_article5)
        article_back=findViewById(R.id.cardBack)

        article1.setOnClickListener {
            val art1= Intent(this,ArticleOneActivity::class.java)
            startActivity(art1)

        }
        article2.setOnClickListener {
            val art2=Intent(this,ArticleTwoActivity::class.java)
            startActivity(art2)

        }
        article3.setOnClickListener {
            val art3=Intent(this,ArticleThreeActivity::class.java)
            startActivity(art3)

        }
        article4.setOnClickListener {
            val art4=Intent(this,ArticleFourActivity::class.java)
            startActivity(art4)

        }
        article5.setOnClickListener {
            val art5=Intent(this,ArticleFiveActivity::class.java)
            startActivity(art5)

        }
        article_back.setOnClickListener {
            val artback=Intent(this,HomeActivity::class.java)
            startActivity(artback)

        }

    }
}