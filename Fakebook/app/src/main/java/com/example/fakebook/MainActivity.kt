package com.example.fakebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fakebook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val listPost: MutableList<DataPost> = mutableListOf(
            DataPost(R.drawable.img1),
            DataPost(R.drawable.img3),
            DataPost(R.drawable.img4),
            DataPost(R.drawable.img6),
            DataPost(R.drawable.img7),
            DataPost(R.drawable.img8),
            DataPost(R.drawable.img12),
            DataPost(R.drawable.img1),
            DataPost(R.drawable.img3),
            DataPost(R.drawable.img4),
            DataPost(R.drawable.img6),
            DataPost(R.drawable.img7),
            DataPost(R.drawable.img8),
            DataPost(R.drawable.img12),

            )

        val sub = AddPostFragment()
        val imgAddPost = findViewById<ImageView>(R.id.addPostImage)

        imgAddPost.setOnClickListener {
            replaceFragment(sub)
        }



        binding.recyclerViewPost.layoutManager =
            LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        binding.recyclerViewPost.adapter = PostAdapter(listPost)
    }

    private fun replaceFragment(sub: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.container, sub, "AddPost")
            commit()
        }

    }
}