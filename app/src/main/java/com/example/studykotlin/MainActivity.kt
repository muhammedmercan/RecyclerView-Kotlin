package com.example.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

    }

    private fun addDataSet(){
        val data = DataSource.createDataSet()
        binding.booksRv.adapter = MovieAdapter(data,this)
    }

    private fun initRecyclerView(){

        binding.booksRv.layoutManager = LinearLayoutManager(this)
        binding.booksRv.setHasFixedSize(true)
    }
}