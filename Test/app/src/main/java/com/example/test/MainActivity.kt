package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CoroutineScope(Dispatchers.Main).launch {
            DatabaseManager.getInstance(applicationContext).userDao().insertUser(
                listOf(User(), User(), User())
            )
            DatabaseManager.getInstance(applicationContext).userDao().insertUser(
                listOf(User(), User(), User())
            )
        }
    }
}