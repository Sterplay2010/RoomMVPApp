package com.pandadevs.heyfix_client.mvp.presenter

interface RoomDBPresenterInterface {
    suspend fun insertData(name:String,lastName:String,age:Int)
    fun showError(error:String)
    fun showResult(result:String)
}