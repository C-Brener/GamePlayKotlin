package com.ciandt.gameplay.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ciandt.gameplay.ListGamesDialogFragment
import com.ciandt.gameplay.R
import com.ciandt.gameplay.databinding.ActivityScheduleMatchesBinding

class ScheduleMatchesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityScheduleMatchesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScheduleMatchesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backScreen.setOnClickListener {
            val intent = Intent(this, HelloPlayer::class.java)
            startActivity(intent)
        }
        val testeFragment = ListGamesDialogFragment()
        binding.buttonTest.setOnClickListener {
            testeFragment.show(supportFragmentManager,"ShowTag")
        }
    }
}