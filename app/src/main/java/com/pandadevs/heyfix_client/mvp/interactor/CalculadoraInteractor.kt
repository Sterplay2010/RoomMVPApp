package com.pandadevs.heyfix_client.mvp.interactor

import com.pandadevs.heyfix_client.mvp.presenter.CalculadoraPresenter
import java.lang.Float.parseFloat

class CalculadoraInteractor(private val presenter: CalculadoraPresenter):CalculadoraInteractorInterface {
    override fun makeOperation(type: Int, numOne: String, numTwo: String) {
        var result = 0.0;
        when(type){
            1 -> {
                result = numOne.toDouble() + numTwo.toDouble()
                presenter.showResult(result.toString())
            }
            2 -> {
                result = numOne.toDouble() * numTwo.toDouble()
                presenter.showResult(result.toString())
            }
            3 -> {
                result = numOne.toDouble() / numTwo.toDouble()
                presenter.showResult(result.toString())
            }
        }
    }
}