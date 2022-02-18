package com.example.studykotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.studykotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
         setContentView(view)

        initRecyclerView()
        addDataSet()

        val prefences = getSharedPreferences("com.example.studykotlin",Context.MODE_PRIVATE)
        val editor = prefences.edit()

        editor.apply()

        binding.button.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, prefences.getString("1","default value"), Toast.LENGTH_SHORT).show()
        })
    }

    private fun addDataSet(){
        val data = DataSource.createDataSet()
        binding.booksRv.adapter = BookAdapter(data,this)

    }
    private fun initRecyclerView(){
        binding.booksRv.layoutManager = LinearLayoutManager(this)
        binding.booksRv.setHasFixedSize(true)
    }


}