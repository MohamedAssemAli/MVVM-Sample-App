package com.assem.mvvmsampleapp.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.assem.mvvmsampleapp.R
import com.assem.mvvmsampleapp.databinding.ActivityLoginBinding
import com.assem.mvvmsampleapp.utils.toast

class LoginActivity : AppCompatActivity(), AuthListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityLoginBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_login)
        val viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)
        binding.viewmodel = viewModel
        viewModel.authListener = this


    }

    override fun onStarted() {
        toast("Login onStarted")
    }

    override fun onSuccess() {
        toast("Login onSuccess")
    }

    override fun onFailure(message: String) {
        toast("Login onFailure")
    }
}
