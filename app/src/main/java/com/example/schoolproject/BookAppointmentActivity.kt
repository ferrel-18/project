package com.example.schoolproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.DatabaseReference

class BookAppointmentActivity : AppCompatActivity() {
    lateinit var edt_name: EditText
    lateinit var edt_phone: EditText
    lateinit var edt_email: EditText
    lateinit var btn_submit: Button
    lateinit var edt_tutorname: EditText
    private lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_appointment)
        edt_name=findViewById(R.id.edt_fullname)
        edt_phone=findViewById(R.id.edt_phone_no)
        edt_email=findViewById(R.id.edt_email)
        edt_tutorname=findViewById(R.id.edt_Tutorname)
        btn_submit=findViewById(R.id.btn_submit)
        btn_submit.setOnClickListener {
            val submit= Intent(this,HomeActivity::class.java)
            startActivity(submit)
            Toast.makeText(this,"Order submitted successfully", Toast.LENGTH_SHORT).show()
            pushDataToDatabase()
        }

    }
    private fun pushDataToDatabase(){
        val fullname=edt_name.text.toString()
        val phonenumber=edt_phone.text.toString()
        val emailaddress=edt_email.text.toString()
        val tutorname=edt_tutorname.text.toString()

        val order=Order(fullname,phonenumber,emailaddress,tutorname)

        val dataReference=database.push()
        dataReference.setValue(order)
            .addOnCompleteListener {task->
                if (task.isSuccessful){
                    Toast.makeText(this,"Order submitted successfully", Toast.LENGTH_SHORT).show()


                }else{
                    Toast.makeText(this,"Please try again", Toast.LENGTH_SHORT).show()
                }

            }

    }
    data class Order(
        val fullname:String="",
        val address:String="",
        val phonenumber:String="",
        val emailaddress:String="",
        val medname:String="",

        )
}




