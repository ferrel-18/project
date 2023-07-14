package com.example.schoolproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.ktx.Firebase

class MedicineOrderDetailsActivity : AppCompatActivity() {
    lateinit var edt_name: EditText
    lateinit var edt_address: EditText
    lateinit var edt_phone: EditText
    lateinit var edt_email: EditText
    lateinit var btnsubmit:Button
    lateinit var edt_medname: EditText
    lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medicine_order_details)
        edt_name=findViewById(R.id.edt_fullname1)
        edt_address=findViewById(R.id.edt_address1)
        edt_phone=findViewById(R.id.edt_phone_no1)
        edt_email=findViewById(R.id.edt_email1)
        database= FirebaseDatabase.getInstance().reference
        btnsubmit=findViewById(R.id.btnsubmit)
        edt_medname=findViewById(R.id.edt_medicinename1)
        btnsubmit.setOnClickListener {
            val intent =Intent(this,HomeActivity::class.java)
            startActivity(intent)


            pushDataToDatabase()
        }

    }
    private fun pushDataToDatabase(){
        val fullname=edt_name.text.toString()
        val address=edt_address.text.toString()
        val phonenumber=edt_phone.text.toString()
        val emailaddress=edt_email.text.toString()
        val medname=edt_medname.text.toString()

        val order=Order(fullname,address,phonenumber,emailaddress,medname)

        val dataReference=database.push()
        dataReference.setValue(order)
            .addOnCompleteListener {task->
                if (task.isSuccessful){
                    Toast.makeText(this,"Order submitted successfully",Toast.LENGTH_SHORT).show()


                }else{
                    Toast.makeText(this,"Please try again",Toast.LENGTH_SHORT).show()
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


