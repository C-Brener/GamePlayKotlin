package com.ciandt.gameplay.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ciandt.gameplay.databinding.ActivityHelloPlayerBinding
import com.squareup.picasso.Picasso

class HelloPlayer : AppCompatActivity() {
    private lateinit var binding: ActivityHelloPlayerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHelloPlayerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val url = "https://github.com/brenermr.png"
        val imageView = binding.iconUser
        setImage(url)

        binding.addNewGame.setOnClickListener {
            val intent = Intent(this,ScheduleMatchesActivity::class.java)
            startActivity(intent)
        }

    }
    private fun setImage(url:String){
        Picasso.get().load(url).into(binding.iconUser)
    }
}
