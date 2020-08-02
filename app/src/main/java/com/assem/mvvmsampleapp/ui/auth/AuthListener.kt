package com.assem.mvvmsampleapp.ui.auth


/**
 * Created by Mohamed Assem on 02-Aug-2020.
 * mohamed.assem.ali@gmail.com
 * https://github.com/MohamedAssemAli
 */
interface AuthListener {
    fun onStarted()
    fun onSuccess()
    fun onFailure(message: String)
}