package com.pandadevs.heyfix_client.mvp.interactor

import com.pandadevs.heyfix_client.StartApplication.Companion.room
import com.pandadevs.heyfix_client.mvp.presenter.RoomDBPresenter
import com.pandadevs.heyfix_client.mvp.room.EmpleadoEntity

class RoomDBInteractor(private val presenter:RoomDBPresenter):RoomDBInteractorInterface {
    override suspend fun insertData(name: String, lastName: String, age: Int) {
        try {
            var result = room.getEmpleadoDao().insert(
                EmpleadoEntity(
                    null,
                    name,
                    lastName,
                    age
                )
            )
            presenter.showResult("Registro creado con el ID => ${result.toString()}")
        }catch (e:Exception){
            presenter.showError(e.message.toString())
        }
    }
}