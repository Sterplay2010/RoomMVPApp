package com.pandadevs.heyfix_client.mvp.presenter

interface CalculadoraPresenterInterface {
    fun makeOperation(type:Int,numOne:String,numTwo:String)
    fun showError(error:String)
    fun showResult(result:String)
}