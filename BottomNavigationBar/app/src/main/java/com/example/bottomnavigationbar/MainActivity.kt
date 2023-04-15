package com.example.bottomnavigationbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sub1 = HomeFragment()
        val sub2 = VideoFragment()
        val sub3 = WallFragment()
        val sub4 = NotifitionFragment()
        val sub5 = MenuFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.homeActivity, sub1)
            commit()
        }

        val navigationView = findViewById<BottomNavigationView>(R.id.btmNavigation)

        navigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.menu_home -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.homeActivity, sub1)
                        commit()
                    }
                    true
                }
                R.id.menu_video -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.homeActivity, sub2)
                        commit()
                    }
                    true
                }
                R.id.menu_wall -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.homeActivity, sub3)
                        commit()
                    }
                    true
                }
                R.id.menu_noti -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.homeActivity, sub4)
                        commit()
                    }
                    true
                }
                R.id.menu_menu -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.homeActivity, sub5)
                        commit()
                    }
                    true
                }

                else -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.homeActivity, sub1)
                        commit()
                    }
                    true
                }
            }

        }

    }

}