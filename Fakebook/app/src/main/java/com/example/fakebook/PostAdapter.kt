package com.example.fakebook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter(
    private val listPost: MutableList<DataPost>
) : RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
    class PostViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val img = view.findViewById<ImageView>(R.id.image)
        val deleteTxt = view.findViewById<TextView>(R.id.txtDeletePost)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return PostViewHolder(view)
    }

    override fun getItemCount(): Int = listPost.size

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.img.setImageResource(listPost[position].img)
        holder.deleteTxt.setOnClickListener {
            listPost.remove(listPost[position])
            notifyDataSetChanged()
        }
    }

}