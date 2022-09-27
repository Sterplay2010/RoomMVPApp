package com.pandadevs.heyfix_client.mvp.interactor

interface RoomDBInteractorInterface {
    suspend fun insertData(name:String,lastName:String,age:Int)
}