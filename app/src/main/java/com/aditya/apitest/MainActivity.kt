package com.aditya.apitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aditya.apitest.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.myBtn.setOnClickListener {

            selectImg()

        }



    }
    private fun selectImg(){

        val randomNum =(1..6).random()

        val getNum= when(randomNum){

            1-> R.drawable.dice
            2->R.drawable.dice2
            3->R.drawable.dice3
            4->R.drawable.dice4
            5->R.drawable.dice5
            else->R.drawable.dice_6


        }

        binding.myImage.setImageResource(getNum)

    }
}