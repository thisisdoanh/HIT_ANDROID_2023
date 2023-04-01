package com.example.calculationfake

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.system.Os.close
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtView = findViewById<TextView>(R.id.txtView)

        val btn0 = findViewById<Button>(R.id.btn0)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7)
        val btn8 = findViewById<Button>(R.id.btn8)
        val btn9 = findViewById<Button>(R.id.btn9)

        val btnAC = findViewById<Button>(R.id.btnAC)
        val btnMulti = findViewById<Button>(R.id.btnMulti)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnDiv = findViewById<Button>(R.id.btnDiv)
        val btnEqual = findViewById<Button>(R.id.btnEqual)
        val btnDecimal= findViewById<Button>(R.id.btnDecimal)
        val btnPercent= findViewById<Button>(R.id.btnPercent)
        val btnOppo= findViewById<Button>(R.id.btnOppo)
        val btnMinus= findViewById<Button>(R.id.btnMinus)
        val btnClose = findViewById<Button>(R.id.btn_close)

        var ptu1 = 0.0
        var ptu2 = 0.0
        var operator=""
        var check=false

        btnAC.setOnClickListener{
            txtView.setText("0")
        }

        btnClose.setOnClickListener {
            Toast.makeText(this, "Bye, mình sẽ nhớ bạn nhìu lắm", Toast.LENGTH_LONG).show()
            finish()
        }

        var phepTinh : View.OnClickListener? = null
        phepTinh = View.OnClickListener {
            if ( it == btn0 ){
                if(check==true) {
                    check=false
                    txtView.setText("0")
                }
                txtView.append("0")
            }
            if ( it == btn1 ){
                if(check==true) {
                    check=false
                    txtView.setText("0")
                }
                txtView.append("1")
            }
            if ( it == btn2 ){
                if(check==true) {
                    check=false
                    txtView.setText("0")
                }
                txtView.append("2")
            }
            if ( it == btn3 ){
                if(check==true) {
                    check=false
                    txtView.setText("0")
                }
                txtView.append("3")
            }
            if ( it == btn4 ){
                if(check==true) {
                    check=false
                    txtView.setText("0")
                }
                txtView.append("4")
            }
            if ( it == btn5 ){
                if(check==true) {
                    check=false
                    txtView.setText("0")
                }
                txtView.append("5")
            }
            if ( it == btn6 ){
                if(check==true) {
                    check=false
                    txtView.setText("0")
                }
                txtView.append("6")
            }
            if ( it == btn7 ){
                if(check==true) {
                    check=false
                    txtView.setText("0")
                }
                txtView.append("7")
            }
            if ( it == btn8 ){
                if(check==true) {
                    check=false
                    txtView.setText("0")
                }
                txtView.append("8")
            }
            if ( it == btn9 ){
                if(check==true) {
                    check=false
                    txtView.setText("0")
                }
                txtView.append("9")
            }
            if ( it == btnMulti ){
                if (ptu1==0.0){
                    ptu1 = txtView.getText().toString().toDouble()
                }
                else ptu2 = txtView.getText().toString().toDouble()
                txtView.setText("")
                operator ="*"
            }
            if ( it == btnMinus ){
                operator ="-"
                if (ptu1==0.0){
                    ptu1 = txtView.getText().toString().toDouble()
                }
                else ptu2 = txtView.getText().toString().toDouble()
                txtView.setText("")
            }
            if ( it == btnAdd ){
                operator ="+"
                if (ptu1==0.0){
                    ptu1 = txtView.getText().toString().toDouble()
                }
                else ptu2 = txtView.getText().toString().toDouble()
                txtView.setText("")

            }
            if ( it == btnDiv ){
                operator ="/"
                if (ptu1==0.0){
                    ptu1 = txtView.getText().toString().toDouble()
                }
                else ptu2 = txtView.getText().toString().toDouble()
                txtView.setText("")
            }
            if ( it == btnDecimal ){
                txtView.append(".")
            }
            if ( it == btnPercent ){
                Toast.makeText(this, "Dấu này đang lỗi nhé :))", Toast.LENGTH_SHORT).show()
            }
            if ( it == btnOppo ){
                Toast.makeText(this, "Dấu này đang lỗi nhé :))", Toast.LENGTH_SHORT).show()
            }
            if ( it == btnEqual ){
                if (ptu1==0.0){
                    ptu1 = txtView.getText().toString().toDouble()
                }
                else ptu2 = txtView.getText().toString().toDouble()
                when (operator) {
                    "+" -> {
                        var kq = ptu1 + ptu2
                        txtView.setText(kq.toString())
                    }
                    "-" -> {
                        var kq = ptu1 - ptu2
                        txtView.setText(kq.toString())
                    }
                    "*" -> {
                        var kq = ptu1 * ptu2
                        txtView.setText(kq.toString())
                    }
                    "/" -> {
                        var kq = ptu1 / ptu2
                        txtView.setText(kq.toString())
                    }
                }
                ptu1=0.0
                ptu2=0.0
                check=true
            }
        }

        btn0.setOnClickListener(phepTinh)
        btn1.setOnClickListener(phepTinh)
        btn2.setOnClickListener(phepTinh)
        btn3.setOnClickListener(phepTinh)
        btn4.setOnClickListener(phepTinh)
        btn5.setOnClickListener(phepTinh)
        btn6.setOnClickListener(phepTinh)
        btn7.setOnClickListener(phepTinh)
        btn8.setOnClickListener(phepTinh)
        btn9.setOnClickListener(phepTinh)
        btnDecimal.setOnClickListener(phepTinh)
        btnDiv.setOnClickListener(phepTinh)
        btnAdd.setOnClickListener(phepTinh)
        btnPercent.setOnClickListener(phepTinh)
        btnOppo.setOnClickListener(phepTinh)
        btnMinus.setOnClickListener(phepTinh)
        btnMulti.setOnClickListener(phepTinh)
        btnEqual.setOnClickListener(phepTinh)


        }
    }
