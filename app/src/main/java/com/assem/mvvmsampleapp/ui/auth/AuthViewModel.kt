package com.assem.mvvmsampleapp.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel


/**
 * Created by Mohamed Assem on 02-Aug-2020.
 * mohamed.assem.ali@gmail.com
 * https://github.com/MohamedAssemAli
 */

class AuthViewModel : ViewModel() {

    var email: String? = null
    var password: String? = null

    var authListener: AuthListener? = null

    fun onLoginButtonClick(view: View) {
        authListener?.onStarted()
        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
            authListener?.onFailure("Invalid Email or Password")
            return
        }
        authListener?.onSuccess()
    }
}