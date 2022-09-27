package com.pandadevs.heyfix_client.mvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.pandadevs.heyfix_client.databinding.ActivityRoomDbactivityBinding
import com.pandadevs.heyfix_client.mvp.presenter.CalculadoraPresenter
import com.pandadevs.heyfix_client.mvp.presenter.RoomDBPresenter
import kotlinx.coroutines.launch

class RoomDBActivity : AppCompatActivity(), RoomDBInterface {
    private lateinit var binding: ActivityRoomDbactivityBinding
    private lateinit var presenter: RoomDBPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRoomDbactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter = RoomDBPresenter(this)
        binding.btnSave.setOnClickListener {
            lifecycleScope.launch {
                presenter.insertData(
                    binding.name.text.toString(),
                    binding.lastName.text.toString(),
                    binding.age.text.toString().toInt()
                )
            }
        }

    }

    override fun showError(error: String) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show()
    }

    override fun showResult(result: String) {
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show()
    }
}