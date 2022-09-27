package com.pandadevs.heyfix_client.mvp.presenter

import com.pandadevs.heyfix_client.mvp.interactor.CalculadoraInteractor
import com.pandadevs.heyfix_client.mvp.view.CalculadoraActivity

class CalculadoraPresenter(private val view:CalculadoraActivity):CalculadoraPresenterInterface {

    private val interactor = CalculadoraInteractor(this)

    override fun makeOperation(type: Int, numOne: String, numTwo: String) {
        interactor.makeOperation(type, numOne, numTwo)
    }

    override fun showError(error: String) {
       view.showError(error)
    }

    override fun showResult(result: String) {
        view.showResult(result)
    }
}