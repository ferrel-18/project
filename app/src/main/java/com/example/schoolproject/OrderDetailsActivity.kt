package com.example.schoolproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.schoolproject.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference

class OrderDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var edt_name: EditText
    lateinit var edt_address:EditText
    lateinit var edt_phone:EditText
    lateinit var edt_email:EditText
    lateinit var btn_submit:Button
    lateinit var edt_bookname:EditText
    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_details)
        edt_name=findViewById(R.id.edt_fullname)
        edt_address=findViewById(R.id.edt_address)
        edt_phone=findViewById(R.id.edt_phone_no)
        edt_email=findViewById(R.id.edt_email)
        edt_bookname=findViewById(R.id.edt_bookname)
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
        val address=edt_address.text.toString()
        val phonenumber=edt_phone.text.toString()
        val emailaddress=edt_email.text.toString()
        val medname=edt_bookname.text.toString()

        val order=Order(fullname,address,phonenumber,emailaddress,medname)

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


