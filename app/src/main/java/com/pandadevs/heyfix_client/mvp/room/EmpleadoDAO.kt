package com.pandadevs.heyfix_client.mvp.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface EmpleadoDAO {
    @Insert
    suspend fun insert(empleadoEntity: EmpleadoEntity):Long
    @Query("SELECT * FROM empleado")
    suspend fun getAll():List<EmpleadoEntity>
    @Update
    suspend fun update(empleadoEntity: EmpleadoEntity)
    @Delete
    suspend fun delete(empleadoEntity: EmpleadoEntity)
    @Query("SELECT * FROM empleado WHERE id = :id")
    suspend fun getOne(id:Int):EmpleadoEntity
}