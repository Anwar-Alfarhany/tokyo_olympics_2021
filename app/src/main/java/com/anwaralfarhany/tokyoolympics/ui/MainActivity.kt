package com.anwaralfarhany.tokyoolympics.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anwaralfarhany.tokyoolympics.data.DataManager
import com.anwaralfarhany.tokyoolympics.databinding.ActivityMainBinding
import com.anwaralfarhany.tokyoolympics.util.CsvParser
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUp()

    }

    private fun setUp(){
        parseFile()
        val adapter = OlympicsAdapter(DataManager.olympics)
        binding.recyclerOlympics.adapter= adapter
    }


    private fun parseFile(){
        val inputStream = assets.open("tokyo_2021.csv")
        val buffer = BufferedReader(InputStreamReader(inputStream))
        val parser = CsvParser()

        buffer.forEachLine {
            val currentOlympic = parser.parse(it)
            DataManager.addOlympics(currentOlympic)

          }

    }


}

//    val myMainFragment = MainFragment()

//
//    private fun initSubView() {
//       val transaction = supportFragmentManager.beginTransaction()
//        transaction.add(R.id.fragment_container, myMainFragment)
//        transaction.commit()
//    }

