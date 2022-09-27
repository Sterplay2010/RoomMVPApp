package com.pandadevs.heyfix_client.mvp.presenter

import com.pandadevs.heyfix_client.mvp.interactor.RoomDBInteractor
import com.pandadevs.heyfix_client.mvp.view.RoomDBActivity

class RoomDBPresenter(private val view:RoomDBActivity):RoomDBPresenterInterface {
    private val interactor = RoomDBInteractor(this)
    override suspend fun insertData(name: String, lastName: String, age: Int) {
        interactor.insertData(name, lastName, age)
    }

    override fun showError(error: String) {
        view.showError(error)
    }

    override fun showResult(result: String) {
        view.showResult(result)
    }
}