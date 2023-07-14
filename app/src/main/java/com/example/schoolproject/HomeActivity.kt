package com.example.schoolproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class HomeActivity : AppCompatActivity() {

    lateinit var myCardView: CardView
    lateinit var myfindteacher:CardView
    lateinit var myaboutus:CardView
    lateinit var mystudyarticles:CardView
    lateinit var rentbks:CardView
    lateinit var buyMed:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        myCardView = findViewById(R.id.CardLogout)
        myCardView.setOnClickListener {
            val exit = Intent(this, MainActivity::class.java)
            startActivity(exit)
        }
        myfindteacher=findViewById(R.id.crdFindTutor)
        myfindteacher.setOnClickListener {
            val findteach=Intent(this,FindTutorActivity::class.java)
            startActivity(findteach)
        }
        myaboutus=findViewById(R.id.ABOUT)
        myaboutus.setOnClickListener {
            val aboutus=Intent(this,About_usActivity::class.java)
            startActivity(aboutus)
        }
        mystudyarticles=findViewById(R.id.StudyArticles)
        mystudyarticles.setOnClickListener {
            val studyart=Intent(this,StudyArticlesActivity::class.java)
            startActivity(studyart)
        }
        rentbks=findViewById(R.id.RentBooks)
        rentbks.setOnClickListener {
            val rentbks=Intent(this,RentBooksActivity::class.java)
            startActivity(rentbks)
        }
        buyMed=findViewById(R.id.SchoolPharmacy)
        buyMed.setOnClickListener {
            val buymed=Intent(this,BuyMedicineActivity::class.java)
            startActivity(buymed)
        }
    }

}