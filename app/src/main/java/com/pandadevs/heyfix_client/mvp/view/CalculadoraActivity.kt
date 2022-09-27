package com.pandadevs.heyfix_client.mvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.pandadevs.heyfix_client.databinding.ActivityCalculadoraBinding
import com.pandadevs.heyfix_client.mvp.presenter.CalculadoraPresenter

class CalculadoraActivity : AppCompatActivity(), CalculadoraInterface {
    private lateinit var binding: ActivityCalculadoraBinding
    private lateinit var presenter: CalculadoraPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculadoraBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter = CalculadoraPresenter(this)
        binding.button.setOnClickListener {
            presenter.makeOperation(1,binding.X.text.toString(),binding.Y.text.toString())
        }

        binding.button2.setOnClickListener {
            presenter.makeOperation(2,binding.X.text.toString(),binding.Y.text.toString())
        }

        binding.button3.setOnClickListener {
            presenter.makeOperation(3,binding.X.text.toString(),binding.Y.text.toString())
        }

    }

    override fun showError(error: String) {
        Toast.makeText(this, "Ha ocurrido un problema en la aplicación", Toast.LENGTH_SHORT).show()
    }

    override fun showResult(result: String) {
        binding.textView2.text = result
    }
}