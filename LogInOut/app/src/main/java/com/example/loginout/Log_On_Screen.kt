package com.example.loginout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.loginout.ListAccount.Companion.listAccount

class Log_On_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val edtAccount = findViewById<EditText>(R.id.edtAccount)
        val edtPass = findViewById<EditText>(R.id.edtPass)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_on_screen)

        val btnLogOn = findViewById<Button>(R.id.btnLogOn)
        val btnLogIn = findViewById<Button>(R.id.btnLogIn)

        btnLogOn.setOnClickListener {
            var accountLogOn : DataAccount =  DataAccount(edtAccount.text.toString()!!,edtPass.text.toString()!!)

            print(ListAccount.listAccount)

            val intent1 = Intent(this, MainActivity::class.java)
            if(ListAccount.listAccount.contains(accountLogOn)){
                startActivity(intent1)
            } else Toast.makeText(this, "Tài khoản hoặc mật khẩu không đúng!", Toast.LENGTH_SHORT).show()

        }
        btnLogIn.setOnClickListener {
            val intent = Intent(this, Log_In_Screen::class.java)
            startActivity(intent)
        }

    }



}