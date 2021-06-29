package com.example.diceroller

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnroll: Button = findViewById(R.id.btn)

        val tvface: TextView = findViewById(R.id.tv2)

        val ivface: ImageView = findViewById(R.id.iv)

        val player = MediaPlayer.create(this,R.raw.dice_sound)

        btnroll.setOnClickListener {
            player.start()
            val randomNum = (1..6).random()
            tvface.text = randomNum.toString()
            if(randomNum==1)
            {
                ivface.setImageResource(R.drawable.dice1)
            }
            else if(randomNum==2)
            {
                ivface.setImageResource(R.drawable.dice2)
            }
            else if(randomNum==3)
            {
                ivface.setImageResource(R.drawable.dice3)
            }
            else if(randomNum==4)
            {
                ivface.setImageResource(R.drawable.dice4)
            }
            else if(randomNum==5)
            {
                ivface.setImageResource(R.drawable.dice5)
            }
            else
            {
                ivface.setImageResource(R.drawable.dice6)
            }

        }
    }
}