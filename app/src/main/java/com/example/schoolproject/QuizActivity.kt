package com.example.schoolproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class QuizActivity : AppCompatActivity() {
    lateinit var Btn_start: Button
    lateinit var edt_name: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

      
        edt_name=findViewById(R.id.edt_name)


        Btn_start=findViewById(R.id.Btn_start)
        Btn_start.setOnClickListener {
            entername()


        }


    }
    private fun entername(){
        if (edt_name.text.toString().isEmpty()){
            Toast.makeText(this,"Please enter your name",Toast.LENGTH_SHORT).show()
        }else{
            val intent= Intent(this,HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

    }


}

