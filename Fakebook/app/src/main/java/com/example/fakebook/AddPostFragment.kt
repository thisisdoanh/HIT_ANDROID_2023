package com.example.fakebook

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class AddPostFragment : Fragment(R.layout.fragment_add_post) {
    private lateinit var adapter: ImageAdapter
    private lateinit var list: List<DataImage>
    private lateinit var recyclerView: RecyclerView

    lateinit var imageId: List<Int>

    val listPost: MutableList<DataPost> = mutableListOf(

    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add_post, container, false)
        initData()
        val recyclerView =
            view?.findViewById<RecyclerView>(R.id.rcv_img)//
        if (recyclerView != null) {
            recyclerView.layoutManager = GridLayoutManager(context, 3, RecyclerView.VERTICAL, false)
        }
        if (recyclerView != null) {
            recyclerView.adapter = ImageAdapter(list)
        }

        val backText = view.findViewById<TextView>(R.id.txtX)
        backText.setOnClickListener {
            val fragment : Fragment? = activity?.supportFragmentManager?.findFragmentByTag("AddPost")

            if (fragment != null){
                activity?.supportFragmentManager?.beginTransaction()?.remove(fragment)?.commit()
            }
        }

        val intent : Intent = Intent( activity, MainActivity::class.java)

        return view.rootView
    }

    private fun initData() {
        list = listOf(
            DataImage(R.drawable.img1),
            DataImage(R.drawable.img2),
            DataImage(R.drawable.img3),
            DataImage(R.drawable.img4),
            DataImage(R.drawable.img5),
            DataImage(R.drawable.img6),
            DataImage(R.drawable.img7),
            DataImage(R.drawable.img8),
            DataImage(R.drawable.img9),
            DataImage(R.drawable.img10),
            DataImage(R.drawable.img11),
            DataImage(R.drawable.img12),
            DataImage(R.drawable.img13),
        )

    }

}