package com.pandadevs.heyfix_client

import android.app.Application
import androidx.room.Room
import com.pandadevs.heyfix_client.mvp.room.Db

class StartApplication:Application() {
    companion object{
        lateinit var room:Db
    }

    override fun onCreate() {
        super.onCreate()
        room = Room.databaseBuilder(applicationContext,Db::class.java,"app").build()
    }
}