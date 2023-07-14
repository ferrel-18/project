package com.example.schoolproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RentBooksActivity : AppCompatActivity() {
    lateinit var btn_rentbk:Button
    lateinit var btn_call:Button
    lateinit var btn_sms:Button
    lateinit var btn_email: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rent_books)
        btn_rentbk=findViewById(R.id.btn_rent)
        btn_rentbk.setOnClickListener {
            val rentbk= Intent(this,OrderDetailsActivity::class.java)
            startActivity(rentbk)
        }
        btn_call=findViewById(R.id.btn_call)
        btn_call.setOnClickListener {
            val phone="0725751466"
            val intent=Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",phone,null))
            startActivity(intent)

        }
        btn_sms=findViewById(R.id.btn_sms)
        btn_sms.setOnClickListener {
            val uri=Uri.parse("Sms to : 0725751466")
            val intant=Intent(Intent.ACTION_SENDTO,uri)
            intent.putExtra("Hello","How are you")
            startActivity(intant)

        }
        btn_email=findViewById(R.id.btn_email)
        btn_email.setOnClickListener {
            val emailIntent=
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("Favel","favelmaloba@gmail.com",null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,"Subject")
            emailIntent.putExtra(Intent.EXTRA_TEXT,"Body")
            startActivity(Intent.createChooser(emailIntent,"Send email..."))
        }
    }
}

