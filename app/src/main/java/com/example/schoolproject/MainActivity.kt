package com.example.schoolproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    GoogleSignInOptions gsop





    lateinit var Txt_gotosignin:TextView
    lateinit var Edt_logusername:EditText
    lateinit var Edt_logemail:EditText
    lateinit var Edt_password:EditText
    lateinit var Btn_login:Button
    lateinit var Txt_forgotpassword:TextView
    lateinit var auth:FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Txt_gotosignin=findViewById(R.id.txt_signinnew)
        Txt_gotosignin.setOnClickListener {
            val signin=Intent(this,SignUpActivity::class.java)
            startActivity(signin)
        }
        Edt_logusername=findViewById(R.id.edt_username)
        Edt_logemail=findViewById(R.id.edt_EmailAddress)
        Edt_password=findViewById(R.id.edt_Password)
        Btn_login=findViewById(R.id.btn_Login)
        auth= FirebaseAuth.getInstance()
        Txt_forgotpassword=findViewById(R.id.txt_forgotpassword)
        Btn_login.setOnClickListener {
            loginuser()

        }



    }
    private fun loginuser(){
        val email=Edt_logemail.text.toString()
        val pass=Edt_password.text.toString()
        val username=Edt_logusername.text.toString()
        auth.signInWithEmailAndPassword(email,pass).addOnCompleteListener {
            if (it.isSuccessful){
                Toast.makeText(this ,"Logged in successfully",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"Failed to login",Toast.LENGTH_LONG).show()
            }
        }

    }
}