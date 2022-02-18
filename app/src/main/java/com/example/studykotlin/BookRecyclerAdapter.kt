package com.example.studykotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

    class BookAdapter(private val bookList: MutableList<Book>, private val context: Context) :
        RecyclerView.Adapter<BookAdapter.ViewHolder>() {

        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

            var name: TextView = view.findViewById(R.id.name)
            var author: TextView = view.findViewById(R.id.author)
            var page: TextView = view.findViewById(R.id.page)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            return ViewHolder(
                LayoutInflater.from(context).inflate(R.layout.layout_book_list_item, parent, false)
            )
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {

            holder.name.text = bookList[position].name
            holder.author.text = bookList[position].author
            holder.page.text = bookList[position].page.toString()

        }
        override fun getItemCount() = bookList.size
    }

