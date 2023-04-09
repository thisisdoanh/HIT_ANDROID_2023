package com.example.loginout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.loginout.ListAccount.Companion.listAccount

class Log_In_Screen : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in_screen)

        val btnLogIn = findViewById<Button>(R.id.btnLogIn)
        val edtAccount = findViewById<EditText>(R.id.edtAccount)
        val edtPass = findViewById<EditText>(R.id.edtPass)
        val edtRepeatPass = findViewById<EditText>(R.id.edtRepeatPass)

        btnLogIn.setOnClickListener {

            if (edtAccount.text.toString() == "" ){
                Toast.makeText(this, "Mời nhập tên tài khoản", Toast.LENGTH_SHORT).show()
            } else if (edtPass.text.toString() == "" ){
                Toast.makeText(this, "Mời nhập mật khẩu", Toast.LENGTH_SHORT).show()
            } else if (edtRepeatPass.text.toString() == "" ){
                Toast.makeText(this, "Mời nhập lại mật khẩu", Toast.LENGTH_SHORT).show()
            } else if (edtPass.text.toString() != edtRepeatPass.text.toString() ){
                Toast.makeText(this, "Mật khẩu không khớp, xin vui lòng thử lại", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, Log_On_Screen::class.java)

                val account:DataAccount = DataAccount(edtAccount.text.toString(), edtPass.text.toString())
                ListAccount.listAccount.add(account)

                startActivity(intent)
            }


        }

    }

}