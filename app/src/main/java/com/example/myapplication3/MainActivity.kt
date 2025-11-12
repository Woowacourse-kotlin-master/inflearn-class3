package com.example.myapplication3

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.myapplication3.databinding.ActivityMainBinding
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val diceImage1 = binding.dice1
        val diceImage2 = binding.dice2



        binding.diceStartBtn.setOnClickListener {
            Toast.makeText(this, "주사위 GO!", Toast.LENGTH_LONG).show()
            /*Log.d("MainActivity", Random.nextInt(1,6).toString())
            Log.d("MainActivity", Random.nextInt(1,6).toString())*/

            val number1 = Random.nextInt(1, 6)
            val number2 = Random.nextInt(1, 6)

            if(number1 == 1){
                diceImage1.setImageResource(R.drawable.dice_1)
            }else if(number1 == 2){
                diceImage1.setImageResource(R.drawable.dice_2)
            }else if(number1 == 3){
                diceImage1.setImageResource(R.drawable.dice_3)
            }else if(number1 == 4){
                diceImage1.setImageResource(R.drawable.dice_4)
            }else if(number1 == 5){
                diceImage1.setImageResource(R.drawable.dice_5)
            }else if(number1 == 6){
                diceImage1.setImageResource(R.drawable.dice_6)
            }


            if(number2 == 1){
                diceImage2.setImageResource(R.drawable.dice_1)
            }else if(number2 == 2){
                diceImage2.setImageResource(R.drawable.dice_2)
            }else if(number2 == 3){
                diceImage2.setImageResource(R.drawable.dice_3)
            }else if(number2 == 4){
                diceImage2.setImageResource(R.drawable.dice_4)
            }else if(number2 == 5){
                diceImage2.setImageResource(R.drawable.dice_5)
            }else if(number2 == 6){
                diceImage2.setImageResource(R.drawable.dice_6)
            }



        }


        /*
               binding=  DataBindingUtil.setContentView(this,R.layout.activity_main)

                // 1번 방식
           *//*     val btn = findViewById<Button>(R.id.testBtnId)
        btn.setOnClickListener {
            Toast.makeText(this, "click", Toast.LENGTH_LONG).show()
        }*//*


        // 2번 방식
        binding.testBtnId.setOnClickListener {
            Toast.makeText(this, "click", Toast.LENGTH_LONG).show()
        }*/
    }
}