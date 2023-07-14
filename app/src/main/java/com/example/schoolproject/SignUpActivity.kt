package com.example.schoolproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class SignUpActivity : AppCompatActivity() {
    lateinit var Edt_username:EditText
    lateinit var Edt_email:EditText
    lateinit var Edt_pass:EditText
    lateinit var Edt_confirmpass:EditText
    lateinit var Btn_Signin:Button
    lateinit var Txt_gotologin:TextView
    lateinit var auth:FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        Edt_username=findViewById(R.id.edt_username)
        Edt_email=findViewById(R.id.edt_EmailAddress)
        Edt_pass=findViewById(R.id.edt_Password)
        Edt_confirmpass=findViewById(R.id.edt_confirmPassword)
        Btn_Signin=findViewById(R.id.btn_Signup)
        auth=Firebase.auth
        Txt_gotologin=findViewById(R.id.Txt_loginnew)
        Txt_gotologin.setOnClickListener {
            val login=Intent(this,MainActivity::class.java)
            startActivity(login)
        }
        Btn_Signin.setOnClickListener {
            signinuser()
            val signin=Intent(this,QuizActivity::class.java)
            startActivity(signin)
            finish()


        }

    }
    private fun signinuser(){
        val email=Edt_email.text.toString()
        val pass=Edt_pass.text.toString()
        val confirmpass=Edt_confirmpass.text.toString()
        if (email.isBlank()||pass.isBlank()||confirmpass.isBlank()){
            Toast.makeText(this,"The password and email can't be blank",Toast.LENGTH_LONG).show()
            return
        }else if (pass!=confirmpass){
            Toast.makeText(this,"The passwords don't match",Toast.LENGTH_LONG).show()
        }
        auth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(this) {
            if (it.isSuccessful){
                Toast.makeText(this,"Signed in successfully",Toast.LENGTH_LONG).show()
                finish()
            }else{
                Toast.makeText(this,"Failed to create user",Toast.LENGTH_LONG).show()
            }
        }
    }
}