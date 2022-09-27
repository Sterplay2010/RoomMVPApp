package com.pandadevs.heyfix_client

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pandadevs.heyfix_client.databinding.ActivityMainBinding
import com.pandadevs.heyfix_client.mvp.view.CalculadoraActivity
import com.pandadevs.heyfix_client.mvp.view.RoomDBActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalc.setOnClickListener {
            val intent = Intent(this,CalculadoraActivity::class.java)
            startActivity(intent)
        }

        binding.btnRoom.setOnClickListener {
            val intent = Intent(this,RoomDBActivity::class.java)
            startActivity(intent)
        }
    }
}